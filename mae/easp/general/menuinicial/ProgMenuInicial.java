package mae.easp.general.menuinicial;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.TextAnchor;
import geyce.maefc.DefaultScaledTheme;
import geyce.maefc.LayoutBorder;
import geyce.maefc.LocationTabbed;
import geyce.maefc.Program;
import geyce.maefc.Selector;
import geyce.maefc.swing.WViewProgram;
import mae.easp.AppEasp;
import mae.easp.general.Easp;

public class ProgMenuInicial extends Program {

	protected AppEasp app;
	//Paneles
	private JPanel jpInicio; //Panell inical Contenedor de los otros 3
	//Grafiques
	private JFreeChart grCDP;
	private ChartPanel panelGrCDP;

	public ProgMenuInicial(AppEasp app) {
		super(app);
		this.app = app;
		setName("menuinicial");
		setTitle ("Inicio");
		setLayout(new LayoutBorder());
		LocationTabbed lt = new LocationTabbed();
		lt.setTitle("Inicio");
		lt.setExitIcon(false);
		setLocation(lt);
	}

	public void run () {
		super.run();
		initPaneles();
	}

	private void initPaneles() {
		initPanelInicio ();		
	}

	private void initPanelInicio() {
		jpInicio = (JPanel) ((WViewProgram)getView()).getRealComponent();
		jpInicio.setLayout(new BorderLayout());
		jpInicio.setBorder(BorderFactory.createTitledBorder("Clientes por aplicación"));

		initGraficaCDP();
	}

	private void initGraficaCDP() {		
		grCDP = ChartFactory.createBarChart(null, // chart title
				null, // domain axis label
				null, // range axis label
				null, // data
				PlotOrientation.HORIZONTAL, // orientation
				true, // include legend
				true, // tooltips?
				false // URLs?
				);
		panelGrCDP = new ChartPanel(grCDP);
		jpInicio.add(panelGrCDP, BorderLayout.CENTER);

		initDatos();
	}

	private void initDatos() {

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		int njco = getCDPs ("cdpckconta");
		int njeo = getCDPs ("cdpckeo");
		int njis = getCDPs ("cdpckiss");
		int njre = getCDPs ("cdpckrenta");
		int njmo = getCDPs (null);
		int njno = getCDPs ("cdpcknomina");
		int njge = getCDPs ("cdpckgestion");

		dataset.addValue(njco, "jConta","");
		dataset.addValue(njeo, "jEo","");
		dataset.addValue(njis, "jSociedades","");
		dataset.addValue(njre, "jRenta","");
		dataset.addValue(njmo, "jModelos","");
		dataset.addValue(njno, "jNomina","");
		dataset.addValue(njge, "jGestion","");

		setBarTheme (njmo);

		CategoryPlot plot = (CategoryPlot) grCDP.getPlot();
		plot.setDataset(dataset);
	}

	private int getCDPs (String campo) {
		int num = 0;
		Selector s = new Selector (Easp.connEA);
		String sql = "Select count(*) as num from CDP ";
		if (campo != null) sql += " where "+campo+"='S'";
		s.execute(sql);
		if (s.next()) num = s.getint("num");
		s.close();
		return num;
	}
	

	protected void setBarTheme (int max) {
		CategoryItemRenderer renderer = new BarRenderer();
		renderer.setBaseItemLabelsVisible(true);
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		renderer.setBaseToolTipGenerator(new StandardCategoryToolTipGenerator());
		((CategoryPlot) grCDP.getPlot()).setRenderer(renderer);
		renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE6, TextAnchor.BOTTOM_CENTER));

		NumberAxis range = (NumberAxis) grCDP.getCategoryPlot().getRangeAxis();
		range.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

		StandardChartTheme theme = (StandardChartTheme) org.jfree.chart.StandardChartTheme.createJFreeTheme();

		theme.setRangeGridlinePaint(Color.decode("#C0C0C0"));
		theme.setPlotBackgroundPaint(Color.white);
		theme.setChartBackgroundPaint(Color.white);
		theme.setAxisOffset(new RectangleInsets(0, 0, 0, 0));
		theme.setBarPainter(new StandardBarPainter());
		theme.setExtraLargeFont(theme.getExtraLargeFont().deriveFont((float)DefaultScaledTheme.getZoom(theme.getExtraLargeFont().getSize())));
		theme.setLargeFont(theme.getLargeFont().deriveFont((float)DefaultScaledTheme.getZoom(theme.getLargeFont().getSize())));
		theme.setRegularFont(theme.getRegularFont().deriveFont((float)DefaultScaledTheme.getZoom(theme.getRegularFont().getSize())));
		theme.setSmallFont(theme.getSmallFont().deriveFont((float)DefaultScaledTheme.getZoom(theme.getSmallFont().getSize())));

		grCDP.getCategoryPlot().setOutlineVisible(false);
		grCDP.getCategoryPlot().getRangeAxis().setAxisLineVisible(false);
		grCDP.getCategoryPlot().getRangeAxis().setTickMarksVisible(false);
		grCDP.getCategoryPlot().setRangeGridlineStroke(new BasicStroke());
		grCDP.setTextAntiAlias(true);
		grCDP.setAntiAlias(true);


		((CategoryPlot) grCDP.getPlot()).getRangeAxis().setUpperBound(max*1.10);
		((CategoryPlot) grCDP.getPlot()).getRangeAxis().setLowerBound(0);	

		BarRenderer r = (BarRenderer) grCDP.getCategoryPlot().getRenderer();
		r.setShadowVisible(true);
		r.setShadowXOffset(0);
		r.setShadowYOffset(0);
		r.setShadowPaint(Color.decode("#C0C0C0"));
		r.setMaximumBarWidth(.10);
		theme.apply(grCDP);

		r.setSeriesPaint(0, Color.decode("#8d8761")); //jConta
		r.setSeriesPaint(1, Color.decode("#496885")); //jEo
		r.setSeriesPaint(2, Color.decode("#ce772f")); //jSociedades
		r.setSeriesPaint(3, Color.decode("#0d4e9c")); //jRenta
		r.setSeriesPaint(4, Color.decode("#f58027")); //jModelos
		r.setSeriesPaint(5, Color.decode("#7b1125")); //jNomina
		r.setSeriesPaint(6, Color.decode("#73ab71")); //jGestion
	}


}
