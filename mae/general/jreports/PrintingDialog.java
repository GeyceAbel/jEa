package mae.general.jreports;


import geyce.maefc.Maefc;
import geyce.maefc.swing.WSystemView;
import geyce.maefc.swing.ZTextField;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import net.sf.jasperreports.engine.fill.AsynchronousFillHandle;

public class PrintingDialog extends Thread implements WindowListener, ActionListener
{
	  protected AsynchronousFillHandle handle;
	  protected JLabel    pagina;
	  protected JButton   cancelar;
	  protected JDialog dialog;

	  PrintingDialog(AsynchronousFillHandle handle)
	  {
	    this.handle = handle;
	    createDialog();
	  }

	  public void setTitle(String title)
	  {
	    dialog.setTitle(title);
	  }

	  public void show()
	  {
	    dialog.setVisible(true);
	  }

	  protected void createDialog()
	  {
	    dialog = new JDialog(WSystemView.getFrame());
	    dialog.setModal(true);
	    dialog.addWindowListener(this);
	    dialog.setResizable(false);
	    JPanel panel = new JPanel(new BorderLayout(20, 20));

	    panel.add(BorderLayout.WEST, createIcon());

	    pagina = createLabel();

	    panel.add(BorderLayout.CENTER, pagina);

	    dialog.getContentPane().add(BorderLayout.CENTER, panel);

	    panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

	    cancelar = createCancelButton();

	    panel.add(cancelar);
	    dialog.getContentPane().add(BorderLayout.SOUTH, panel);
	    dialog.pack();
	    Maefc.center(dialog);
	    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	  }

	  protected JComponent createIcon()
	  {
	    ImageIcon icon = Maefc.getImageIcon("mae/general/jreports/printing.gif");	    

	    JLabel label = new JLabel(icon);
	    label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	    return label;
	  }

	  protected JLabel createLabel()
	  {
	    return new LLabel("Cargando vista previa  ", 20);
	  }

	  protected JButton createCancelButton()
	  {
	    JButton b = new JButton("Cancelar");
	    b.addActionListener(this);
	    dialog.getRootPane().setDefaultButton(b);
	    return b;
	  }

	  public void setLabelText(String text)
	  {
	    pagina.setText(text);
	  }

	  public void run()
	  {
		  if (handle!=null) handle.startFill();
	  }

	  public void windowOpened(WindowEvent e)
	  {
	    start();
	  }

	  public void actionPerformed(ActionEvent e)
	  {
	    if (confirmaTancar())
	    {
	      close();
	    }
	  }

	  boolean confirmaTancar()
	  {
		  try {
			  if (handle!=null) handle.cancellFill();
		  }
		  catch (Exception e) {
			  e.printStackTrace();
		  }
		  return true;
	  }

	  public void windowClosing(WindowEvent e)
	  {
	    if (confirmaTancar())
	    {
	      close();
	    }
	  }

	  public void windowClosed(WindowEvent e)
	  {
	  }

	  public void windowIconified(WindowEvent e)
	  {
	  }

	  public void windowDeiconified(WindowEvent e)
	  {
	  }

	  public void windowActivated(WindowEvent e)
	  {
	  }

	  public void windowDeactivated(WindowEvent e)
	  {
	  }

	  public void close()
	  {
	    dialog.setVisible(false);
	    dialog.dispose();
	  }

	  static class LLabel extends JLabel
	  {
	    int               cols;
	    static final long serialVersionUID = 0; // M'ho demana...sinó dona warning

	    LLabel(String texte, int cols)
	    {
	      super(texte);
	      this.cols = cols;
	    }

	    public Dimension getPreferredSize()
	    {
	      return ZTextField.getCellSize(this, cols);
	    }
	  }
}
