// Clase:       ProgressBarForm
// Autor:       Eduard Roige, I+D GEYCE S.A.
// Cliente:     MAE
package mae.general;

import geyce.maefc.*;

public abstract class ProgressBarForm extends Form{
  private CtrlEstat estat;
  private ControlLabel lprogres;
  private ControlProgressBar progres;
  private ControlLabel lparcial;
  private ControlProgressBar parcial;
  private CtrlButtonCancelar cancelar;

  private boolean cancel=false;
  private boolean auto=false;
  private boolean secondaryAuto=false;
  private boolean secondary=false;

  private int dimX=400;
  private int dimY=110;
  private int dimYs=125;

  private int autoMilli=250;
  private int secondaryAutoMilli=200;

  private boolean modal=true;

  private int factor1=10;
  private int factor2=10;
  private int sfactor1=10;
  private int sfactor2=10;

  public static final int AUTO_SPEED_SLOW=1;
  public static final int AUTO_SPEED_MEDIUM=2;
  public static final int AUTO_SPEED_FAST=3;

  private class Location extends LocationWindow{
    public Location()
      {
      super();
      setWidth(dimX);
      if (secondary) setHeight(dimYs);
      else setHeight(dimY);
      setModal(true);
      setLocation(CENTER);
      //setResizable(false);
      }
    }

  private class CtrlEstat extends ControlLabel
    {
    CtrlEstat(VisualPanel vp)
      {
      super(vp);
      setTitle("En proceso... ");
      setLook(new LookComponent());
      }
    }

  private class CtrlButtonCancelar extends ControlButton
    {
    public CtrlButtonCancelar(VisualPanel vp)
      {
      super(vp);
      setTitle("Cancelar");
      }
    public void onClick()
      {
      super.onClick();
      cancel=true;
      }
    }

  private void estat(){
    ControlPanel cp=new ControlPanel(this);
    cp.setLayout(new LayoutBorder());
    cp.setLocation(new LocationBorder(LocationBorder.NORTH));
    cp.addControl(estat=new CtrlEstat(cp));
    estat.setLook(new LookComponent());
    estat.getLook().setForeground(LookComponent.blue);
    addControl(cp);
    }

  private ControlLabel labelParcial(VisualPanel vp){
    lparcial=new ControlLabel(vp);
    lparcial.setLocation(new LocationBorder(LocationBorder.SOUTH));
    lparcial.setTitle("Parcial");
    lparcial.setLook(new LookComponent());
    lparcial.getLook().setForeground(LookComponent.red);
    return lparcial;
    }

  private ControlLabel labelProgres(VisualPanel vp){
    lprogres=new ControlLabel(vp);
    lprogres.setLocation(new LocationBorder(LocationBorder.NORTH));
    lprogres.setTitle("Progreso ");
    lprogres.setLook(new LookComponent());
    lprogres.getLook().setForeground(LookComponent.red);
    return lprogres;
    }

  private ControlProgressBar progresBar(VisualPanel vp){
    progres=new ControlProgressBar(vp);
    progres.setLocation(new LocationBorder(LocationBorder.NORTH));
    progres.setTitle("");
    return progres;
    }

  private ControlProgressBar parcialBar(VisualPanel vp){
    parcial=new ControlProgressBar(vp);
    parcial.setLocation(new LocationBorder(LocationBorder.SOUTH));
    parcial.setTitle("");
    return parcial;
    }

  private void barres(){
    ControlPanel cp=new ControlPanel(this);
    cp.setLayout(new LayoutBorder());
    cp.setLocation(new LocationBorder(LocationBorder.CENTER));

    ControlPanel cp1=new ControlPanel(cp);
    cp1.setLayout(new LayoutBorder());
    cp1.setLocation(new LocationBorder(LocationBorder.WEST));
    cp1.addControl(labelProgres(cp1));
    if (secondary) cp1.addControl(labelParcial(cp1));

    ControlPanel cp2=new ControlPanel(cp);
    cp2.setLayout(new LayoutBorder());
    cp2.setLocation(new LocationBorder(LocationBorder.CENTER));
    cp2.addControl(progresBar(cp2));
    if (secondary) cp2.addControl(parcialBar(cp2));
    addControl(cp2);
    }

  private void boto(){
    ControlPanel cp=new ControlPanel(this);
    cp.setLayout(new LayoutFlow());
    cp.setLocation(new LocationBorder(LocationBorder.SOUTH));
    cp.addControl(cancelar=new CtrlButtonCancelar(cp));
    addControl(cp);
    }

  public ProgressBarForm(Program program, String title, boolean state, boolean secondary, boolean modal){
    super(program);
    this.secondary=secondary;
    setTitle(title);
    setLocation(new Location());
    setLayout(new LayoutBorder());
    setPrintable(false);
    this.modal=modal;
    if (modal) setModal(true);

    if (state) estat();
    barres();
    boto();
    }

  public ProgressBarForm(Program program, String title, boolean state, boolean secondary){
    this(program,title,true,false,true);
    }


  public ProgressBarForm(Program program, String title){
    this(program,title,true,false,true);
    }

  public ProgressBarForm(Program program, String title, boolean state){
    this(program,title,state,false,true);
    }

  public abstract void job();

  public void onExit(){
    cancel=true;
    }

  public void setEnabledCancel(boolean enable){
    cancelar.setEnabled(enable);
    }

  public boolean isCanceled(){
    return cancel;
    }

  public void setPercentName(String name){
    lprogres.setTitle(name);
    }

  public void setSecondaryPercentName(String name){
    if (lparcial!=null) lparcial.setTitle(name);
    }

  public void setStateLength(int length){
    if (estat!=null) estat.setLength(length);
    }

  public void setStateName(String name){
    estat.setTitle(name);
    }

  public void setPercent(int percent){
    progres.setValue(percent);
    }

  public void setSecondaryPercent(int percent){
    if (parcial!=null) parcial.setValue(percent);
    }

  public void setState(String state){
    if (estat!=null) estat.setTitle(state);
    }

  public void setAuto(boolean auto){
    this.auto=auto;
    }

  public void setSecondaryAuto(boolean auto){
    this.secondaryAuto=auto;
    }

  public void setAutoMilli(int milli){
    autoMilli=milli;
    }

  public void setSecondaryAutoMilli(int milli){
    secondaryAutoMilli=milli;
    }

  public void setFormWidth(int dimX){
    this.dimX=dimX;
    }

  public void setFormHeight(int dim){
    if (secondary) dimYs=dim;
    else dimY=dim;
    }
  public void setAutoSpeed(int speed){
    switch(speed){
      case ProgressBarForm.AUTO_SPEED_SLOW:
        factor1=100;
        factor2=1;
      break;
      case ProgressBarForm.AUTO_SPEED_MEDIUM:
        factor1=50;
        factor2=2;
      break;
      case ProgressBarForm.AUTO_SPEED_FAST:
        factor1=10;
        factor2=10;
      break;
      }
    }

  public void setSecondaryAutoSpeed(int speed){
    switch(speed){
      case ProgressBarForm.AUTO_SPEED_SLOW:
        sfactor1=100;
        sfactor2=1;
      break;
      case ProgressBarForm.AUTO_SPEED_MEDIUM:
        sfactor1=50;
        sfactor2=2;
      break;
      case ProgressBarForm.AUTO_SPEED_FAST:
        sfactor1=10;
        sfactor2=10;
      break;
      }
    }

  private void auto(){
    new Thread()
      {
      public void run(){
        int i=0;
        while(auto){
          i=i % factor1;
          try{
            Thread.sleep(autoMilli);
            }
          catch(InterruptedException e){
            }
          setPercent(++i*factor2);
          }
        }
      }.start();
    }

  private void secondaryAuto(){
    new Thread()
      {
      public void run(){
        int i=0;
        while(secondaryAuto){
          i=i % sfactor1;
          try{
            Thread.sleep(secondaryAutoMilli);
            }
          catch(InterruptedException e){
            }
//          setSecondaryPercent(++sfactor2*10);
          setSecondaryPercent(++i*sfactor2);
          }
        }
      }.start();
    }

  public void onOpened(){
    super.onOpened();
    new Thread()
      {
      public void run(){
        job();
        }
      }.start();

    if (auto) auto();
    if (secondaryAuto) secondaryAuto();
    }

  public boolean launch(){
    run();
    return !cancel;
    }
  }

