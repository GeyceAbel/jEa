package mae.general;


import geyce.maefc.Maefc;
import geyce.maefc.swing.WSystemView;
import geyce.maefc.swing.ZTextField;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import mae.general.jreports.Totalizar.Calculation;

public class PrintingDialogQuery extends Thread  implements WindowListener, ActionListener
{
	  
	  protected enum Icon { WORD, PDF} ;
	  protected mae.general.PlantillaJacob plantilla;
	  protected JLabel    pagina;
	  protected JButton   cancelar;
	  protected JDialog dialog;
	  private Icon typeIcon;

	  PrintingDialogQuery(PlantillaJacob plantilla,Icon typeIcon)
	  {
	    this.plantilla = plantilla;
	    this.typeIcon = typeIcon;
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
	    dialog.setSize(420, 150);
	    Maefc.center(dialog);
	    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	    
	  }

	  protected JComponent createIcon()
	  {
	    ImageIcon icon;
	    if(typeIcon == Icon.WORD)
	      icon = Maefc.getImageIcon("mae/easp/html/documentWordIconNew.png");
	    else 
	      icon = Maefc.getImageIcon("mae/easp/html/documentPdfIcon.png");

	    JLabel label = new JLabel(icon);
	    label.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	    return label;
	  }

	  protected JLabel createLabel()
	  {
	    return new LLabel("Cargando componentes del sistema", 20);
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
		try {
		  if (plantilla!=null) plantilla.start();
		  plantilla.join();
		  this.close();
		}
		catch(Exception ex) {
		  plantilla.tanca();
		  this.close();
		  ex.printStackTrace();
		  System.out.println("Error  : " + ex.getMessage());
		}

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
			  if (plantilla!=null) plantilla.tanca();
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
