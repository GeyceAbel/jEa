package mae.easp.general;

import java.util.Date;

import geyce.maefc.*;
import mae.general.*;


public class ValidNamesAEAT {


  public ProgressBarForm pbf ;

  public  DBConnection connLaboral=null;

  public mae.easp.prvalidanomaeat.ProgPrvalidanomaeat pr ;

  public ValidNamesAEAT(mae.easp.prvalidanomaeat.ProgPrvalidanomaeat vPr ) {
    pr = vPr ;
    }

  public void corregirNombres ( ) {

    String whereExtra = " and vnaestadoaeat = 'SIMILAR' " ;
    if ( pr.vvalidanoms.getQbfWhere() != null && !pr.vvalidanoms.getQbfWhere().equals("") && !pr.vvalidanoms.getQbfWhere().equals("null") )
      pr.svalidautil.setWhere(pr.svalidanomaeat.getWhere()+" and "+pr.vvalidanoms.getQbfWhere()+whereExtra);
    else
      pr.svalidautil.setWhere(pr.svalidanomaeat.getWhere()+whereExtra);

    pr.svalidautil.execute();
    while ( !pr.svalidautil.isEof() ) {
      if ("JEO".equals(pr.aplicacion))  {
    	 String tabla2 = "";
         String prefijo = "";
         String prefijo2 = "";
         String sufijonombre = "razon";
         String sufijonif = "nifper";
         String where = "";
         String where2 = "";
         boolean retorn = false;
         if ("modelos".equals(pr.svalidautil.vnabasedatos.getString())) {
             prefijo = "m"+pr.svalidautil.vnatabla.getString().substring(3);
             if ("mod184n".equals(pr.svalidautil.vnatabla.getString())) sufijonif = "nifmiembr";
             else if ("mod190d".equals(pr.svalidautil.vnatabla.getString()) || "mod110d".equals(pr.svalidautil.vnatabla.getString())) sufijonombre = "nombre";
             else if ("mod347d".equals(pr.svalidautil.vnatabla.getString())) sufijonif = "nifado";
             where = prefijo+"dominio='"+Easp.dominio+"' and "+prefijo+"nif='"+pr.svalidautil.vnanifemp.getString()+"' and "+prefijo+"ejercicio="+pr.ejercicio+" and "+prefijo+sufijonif+"='"+pr.svalidautil.vnanif.getString()+"'";
             if ("mod180r".equals(pr.svalidautil.vnatabla.getString()) || "mod190d".equals(pr.svalidautil.vnatabla.getString()) || "mod193d".equals(pr.svalidautil.vnatabla.getString())) {
            	 if ("mod180r".equals(pr.svalidautil.vnatabla.getString())) tabla2 = "mod115d";
            	 else if ("mod190d".equals(pr.svalidautil.vnatabla.getString())) tabla2 = "mod110d";
            	 else if ("mod193d".equals(pr.svalidautil.vnatabla.getString())) tabla2 = "mod123d";
                 prefijo2 = "m"+tabla2.substring(3);
                 where2 = prefijo2+"dominio='"+Easp.dominio+"' and "+prefijo2+"nif='"+pr.svalidautil.vnanifemp.getString()+"' and "+prefijo2+"ejercicio="+pr.ejercicio+" and "+prefijo2+sufijonif+"='"+pr.svalidautil.vnanif.getString()+"'";
             }
             try {
        		 pr.connExtMod.executeUpdate("update "+pr.svalidautil.vnatabla.getString()+" set "+prefijo+sufijonombre+"= '"+pr.svalidautil.vnanombreaeat.getString()+"' where "+where);
        		 if (!"".equals(where2))
        			 pr.connExtMod.executeUpdate("update "+tabla2+" set "+prefijo2+sufijonombre+"= '"+pr.svalidautil.vnanombreaeat.getString()+"' where "+where2);
        		 retorn = true;
        	 }
        	 catch(Exception e ) {
             }
         }
         else {
           // socios directament nifes
           if ("empresa".equals(pr.svalidautil.vnatabla.getString())) {
              sufijonif = "nif";
              prefijo = "emp";
              sufijonombre = "nombre";
              where = prefijo+"codigo="+pr.svalidautil.vnacodigoemp.getInteger();
           }
           else if ("acumulado347".equals(pr.svalidautil.vnatabla.getString())) {
              sufijonif = "nif";
              prefijo = "a347";
              where = prefijo+"empresa="+pr.svalidautil.vnacodigoemp.getInteger()+" and "+prefijo+"ejercicio="+pr.ejercicio+" and "+prefijo+sufijonif+"='"+pr.svalidautil.vnanif.getString()+"'";
           }
           else if ("pcuentas".equals(pr.svalidautil.vnatabla.getString())) {
              sufijonif = "nif";
              prefijo = "pcu";
              sufijonombre = "desc";
              String cuenta = "";
              String subcuenta = "";
              if (pr.svalidautil.vnacodigo.getString()!=null && !"".equals(pr.svalidautil.vnacodigo.getString().trim())) {
            	  cuenta = pr.svalidautil.vnacodigo.getString().substring(0,20).trim();
            	  subcuenta = pr.svalidautil.vnacodigo.getString().substring(20).trim();
              }
              where = prefijo+"empresa="+pr.svalidautil.vnacodigoemp.getInteger()+" and "+prefijo+"cuenta='"+cuenta+"' and "+prefijo+"subcuenta='"+subcuenta+"'";
           }
           if (!"".equals(where)) {
          	 try {
          		 pr.connExterna.executeUpdate("update "+pr.svalidautil.vnatabla.getString()+" set "+prefijo+sufijonombre+"= '"+pr.svalidautil.vnanombreaeat.getString()+"' where "+where);
          		 retorn = true;
          	 }
          	 catch(Exception e ) {
               }
           }
         }
         if (retorn && !"pcuentas".equals(pr.svalidautil.vnatabla.getString())) {
        	 try {
          		 pr.connExterna.executeUpdate("update pcuentas set pcudesc= '"+pr.svalidautil.vnanombreaeat.getString()+"' where pcuempresa="+pr.svalidautil.vnacodigoemp.getInteger()+" and pcunif='"+pr.svalidautil.vnanif.getString()+"'");
          		 retorn = true;
          	 }
          	 catch(Exception e ) {
          		 retorn = false;
               }
         }
         if (retorn || "socios".equals(pr.svalidautil.vnatabla.getString())) {
        	 pr.snifes.setWhere("danifcif = '"+pr.svalidautil.vnanif.getString()+"'");
             pr.snifes.execute();
             if ( !pr.snifes.isEof() ) {
            	 retorn = true;
            	 String nomAEAT = pr.svalidautil.vnanombreaeat.getString();
                 String noms[] = separa(nomAEAT);
                 pr.snifes.edit();
                 if ( pr.snifes.datapell1ant.isNull() && pr.snifes.datapell2ant.isNull() && pr.snifes.datnombreant.isNull() ) {
                   pr.snifes.datapell1ant  .setValue(pr.snifes.datapell1 );
                   pr.snifes.datapell2ant  .setValue(pr.snifes.datapell2 );
                   pr.snifes.datnombreant  .setValue(pr.snifes.datnombre );
                 }
                 pr.snifes.datapell1  .setValue(noms[0]);
                 pr.snifes.datapell2  .setValue(noms[1]);
                 pr.snifes.datnombre  .setValue(noms[2]);
                 pr.snifes.update();
             }
             if (retorn){
            	 pr.svalidautil.edit();
                 pr.svalidautil.vnanombre.setValue(pr.svalidautil.vnanombreaeat.getString());
                 pr.svalidautil.vnaestadoaeat.setValue("VALIDO");
                 pr.svalidautil.update();
             }
         }
      }
      else {
          pr.snifes.setWhere("danifcif = '"+pr.svalidautil.vnanif.getString()+"'");
          pr.snifes.execute();
          if ( !pr.snifes.isEof() ) {
            boolean retorn = false ;
            String nomAEAT = pr.svalidautil.vnanombreaeat.getString();
            String noms[] = separa(nomAEAT);
            if ( pr.connExterna != null && pr.tablaUpdate != null && pr.campoUpdate != null && pr.campoCodEmpresa !=  null && pr.campoCodigo != null ) {
              try {
                String cometes = "'" ;
                String codigo = pr.svalidautil.vnacodigo.getString() ;
                if ( pr.isCampoCodigoInteger ) {
                  cometes = "";
                  codigo = String.valueOf(Integer.parseInt(pr.svalidautil.vnacodigo.getString())).trim() ;
                  }
                pr.connExterna.executeUpdate("update "+pr.tablaUpdate+" set "+pr.campoUpdate+"= '"+pr.svalidautil.vnanombreaeat.getString()+"' where "+pr.campoCodEmpresa+" = "+pr.svalidautil.vnacodigoemp.getString()+" and "+pr.campoCodigo+" = "+cometes+codigo+cometes );
                retorn = true ;
              }
              catch(Exception e ) {
              }

            }

            if ( retorn ) {
              pr.snifes.edit();
              if ( pr.snifes.datapell1ant.isNull() && pr.snifes.datapell2ant.isNull() && pr.snifes.datnombreant.isNull() ) {
                pr.snifes.datapell1ant  .setValue(pr.snifes.datapell1 );
                pr.snifes.datapell2ant  .setValue(pr.snifes.datapell2 );
                pr.snifes.datnombreant  .setValue(pr.snifes.datnombre );
                }
              pr.snifes.datapell1  .setValue(noms[0]);
              pr.snifes.datapell2  .setValue(noms[1]);
              pr.snifes.datnombre  .setValue(noms[2]);
              pr.snifes.update();

              pr.svalidautil.edit();
              pr.svalidautil.vnanombre.setValue(pr.svalidautil.vnanombreaeat.getString());
              pr.svalidautil.vnaestadoaeat.setValue("VALIDO");
              pr.svalidautil.update();

              }

            }
      }
      pr.svalidautil.next();
      }

    pr.svalidautil.commit();
    if (pr.connExterna!=null) pr.connExterna.commit();
    if (pr.connExtMod!=null) pr.connExtMod.commit();
    pr.prvalidanomaeat.vvalidanoms.doShow() ;

    Maefc.message("Proceso finalizado","Atención",Maefc.INFORMATION_MESSAGE ) ;

    }


  public static String separa(String nomComp)[] {
    String retorn[]=new String[3];
  nomComp=trimS4N(nomComp);
  int coma = nomComp.indexOf(",");
  if ( coma > 0 ) {
    if(!nomComp.substring(coma+1,nomComp.length()).trim().equals(""))
      retorn[2]=nomComp.substring(coma+1,nomComp.length()).trim();
    else
      retorn[2]=null;
    retorn[0]=separaApellidos(nomComp.substring(0,coma))[0];
    retorn[1]=separaApellidos(nomComp.substring(0,coma))[1];
    }
  else {
    /*retorn[0]=nomComp.trim();
      retorn[1]=null;
      retorn[2]=null;*/
    // POT HAVER-HI NOMS SENSE COMA, LLAVORS NO ES POT TRACTAR PERQUE NO ES SAP ON ES EL NOM I ON EL COGNOM.
    int numEspais=0;
    for ( int i=0 ; i < nomComp.length() ; i++ ) {
    if ( nomComp.charAt(i) == ' ' ) numEspais++;
      }
    if ( numEspais == 0 ) {
      retorn[0]=nomComp;
      retorn[1]=" ";
      retorn[2]=" ";
      }
    else  {
      int index  = nomComp.indexOf(" ");
      if ( numEspais == 1 ) {
        retorn[0]=nomComp.substring(0,index).trim();
        retorn[1]=" ";
        retorn[2]=nomComp.substring(index+1,nomComp.length()).trim();
        }
      if ( numEspais == 2 ) {
        int index2 = nomComp.indexOf(" ",index+1);
        retorn[0]=nomComp.substring(0,index).trim();
        retorn[1]=nomComp.substring(index+1,index2).trim();
        retorn[2]=nomComp.substring(index2+1,nomComp.length()).trim();
        }
      if ( numEspais == 3 ) {
        int index2 = nomComp.indexOf(" ",index+1);
        int index3 = nomComp.indexOf(" ",index2+1);
        retorn[0]=nomComp.substring(0,index).trim();
        retorn[1]=nomComp.substring(index+1,index2).trim();
        retorn[2]=nomComp.substring(index2+1,nomComp.length()).trim();
        }
      if ( numEspais > 3 ) {
        retorn[0]=nomComp.trim();
        retorn[1]=" ";
        retorn[2]=" ";
        }
      }
    }
    return retorn;
  }

  public static String separaApellidos(String apellidos)[] {
    String retorn[]=new String[2];
  apellidos=trimS4N(apellidos);
  int numEspais=0;
  for ( int i=0 ; i < apellidos.length() ; i++ ) {
    if ( apellidos.charAt(i) == ' ' ) numEspais++;
    }
    if ( numEspais == 0 ) {
    retorn[0]=apellidos;
    retorn[1]=null;
    }
  else {
    if ( numEspais == 1) {
      int index = apellidos.indexOf(" ");
      retorn[0]=apellidos.substring(0,index);
      retorn[1]=apellidos.substring(index+1,apellidos.length());
      }
    if ( numEspais > 1 ) {
      retorn[0]=apellidos;
      retorn[1]=null;
      }
      }
  return retorn;
    }
  public static String trimS4N(String cadena) {
  String retorn="" ;
  cadena=cadena.trim();
  boolean sw1=true;
  for ( int i=0 ; i < cadena.length() ; i++ ) {
    if ( cadena.charAt(i) == ' ' && sw1 ) {
      retorn+=cadena.substring(i,i+1);
      sw1=false;
      }
    else {
      if ( cadena.charAt(i) != ' ' ) {
        retorn+=cadena.substring(i,i+1);
        sw1=true;
        }
      }
    }
    return retorn;
  }


  }
