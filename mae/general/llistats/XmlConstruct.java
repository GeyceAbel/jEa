package mae.general.llistats;

import com.sun.xml.tree.XmlDocument;
import org.w3c.dom.*;
import geyce.maefc.*;


class XmlDocumentConstruct
{
  private XmlDocument document;
  private Element     informe;
  private Element     body;
  private Element     config;

  XmlDocumentConstruct()
  {
    document = new XmlDocument();
    informe = document.createElement("informe");
    document.appendChild(informe);
    config = document.createElement("config");
    informe.appendChild(config);
    body = document.createElement("body");
    informe.appendChild(body);
  }

  public Element getInforme()
  {
    return informe;
  }

  public Element getBody()
  {
    return body;
  }

  public XmlDocument getXmlDocument()
  {
    return document;
  }

  public void landscape()
  {
    Element landscape = document.createElement("landscape");
    config.appendChild(landscape);
  }

  public void comprimido()
  {
    cpi(17);
    lpi(12);
  }

  public void normal()
  {
    cpi(12);
    lpi(8);
  }

  public void cpi(int n)
  {
    Element cpi = document.createElement("cpi" + n);
    config.appendChild(cpi);
  }

  public void lpi(int n)
  {
    Element lpi = document.createElement("lpi" + n);
    config.appendChild(lpi);
  }
  public void fontSize(int n)
  {
    Element font = document.createElement("font");
    font.setAttribute("size", String.valueOf(n));
    config.appendChild(font);
  }

  public Text Text(String str)
  {
    return document.createTextNode(str);
  }

  public Text addText(String str)
  {
    Text text = Text(str);
    body.appendChild(text);
    return text;
  }

  public Text addText(Element pare, String str)
  {
    Text text = Text(str);
    pare.appendChild(text);
    return text;
  }

  public Text addText(Element pare, Text text)
  {
    pare.appendChild(text);
    return text;
  }

  public Element addBlock(Element pare, int num)
  {
    Element block = document.createElement("block");
    block.setAttribute("id", String.valueOf(num));
    pare.appendChild(block);
    return block;
  }

  public Element addBlock(int num)
  {
    return addBlock(body, num);
  }

  public Element addCond(Element pare, int num)
  {
    Element block = document.createElement("cond");
    block.setAttribute("id", String.valueOf(num));
    pare.appendChild(block);
    return block;
  }

  public Element addCond(int num)
  {
    return addBlock(body, num);
  }

  public void addTab(Element pare, int pos)
  {
    Element tab = document.createElement("tab");
    tab.setAttribute("pos", String.valueOf(pos));
    pare.appendChild(tab);
  }

  public void addTab(int pos)
  {
    addTab(body, pos);
  }

  public Element addVar(ControlValue ctrl, Element pare, int num, int width, boolean excel)
  {
    Element variable = document.createElement("var");
    variable.setAttribute("id", String.valueOf(num));
    if (width > 0)
      variable.setAttribute("width", String.valueOf(width));
    
    if (ctrl != null && 
       (ctrl instanceof ControlEdit) &&
       ctrl.getType()==Value.DOUBLE && 
       (((ControlEdit) ctrl).getMaskInput() != null))
      variable.setAttribute("format", Maefc.maefcFormatToJavaFormat(((ControlEdit) ctrl).getMaskInput()));
    
    pare.appendChild(variable);
    return variable;
  }

  public Element addVar(Element pare, int num, boolean excel)
  {
    return addVar(null, pare, num, 0, excel);
  }

  public Element addVar(Element pare, int num, int width, boolean excel)
  {
    return addVar(null, pare, num, width, excel);
  }

  public Element addSysVar(Element pare, String nomvar)
  {
    Element variable = document.createElement("sysvar");
    variable.setAttribute("id", nomvar);
    pare.appendChild(variable);
    return variable;
  }

  public Element addVar(ControlValue ctrl, Element pare, int num, boolean excel)
  {
    return addVar(ctrl, pare, num, 0, excel);
  }

  public Element addVar(ControlValue ctrl, int num, int width, boolean excel)
  {
    return addVar(ctrl, body, num, width, excel);
  }

  public Element addVar(ControlValue ctrl, int num, boolean excel)
  {
    return addVar(ctrl, body, num, 0, excel);
  }

  public Element addExcel(Element pare)
  {
    Element elem = document.createElement("excel");
    pare.appendChild(elem);
    return elem;
  }
  public void addPage()
  {
	  addPage(body);
  }
  public Element addPage(Element pare)
  {
    Element elem = document.createElement("page");
    pare.appendChild(elem);
    return elem;
  }


  public void addBr(Element pare)
  {
    Element br = document.createElement("br");
    pare.appendChild(br);
  }

  public void addBr()
  {
    addBr(body);
  }

  public Element attribute(Element pare, Element fill, String name)
  {
    Element attribute = document.createElement("attr");
    attribute.setAttribute("id", name);
    if (fill != null)
      attribute.appendChild(fill);
    if (pare != null)
      pare.appendChild(attribute);
    return attribute;
  }

  public Element attribute(Element pare, Text fill, String name)
  {
    Element attribute = document.createElement("attr");
    attribute.setAttribute("id", name);
    if (fill != null)
      attribute.appendChild(fill);
    if (pare != null)
      pare.appendChild(attribute);
    return attribute;
  }

  public Element underline(Element pare, Element fill)
  {
    return attribute(pare, fill, "UNDERLINE");
  }

  public Element underline(Element fill)
  {
    return underline(null, fill);
  }

  public Element underline(Element pare, Text fill)
  {
    return attribute(pare, fill, "UNDERLINE");
  }

  public Element underline(Text fill)
  {
    return underline(null, fill);
  }

  public Element bold(Element pare, Element fill)
  {
    return attribute(pare, fill, "BOLD");
  }

  public Element bold(Element fill)
  {
    return bold(null, fill);
  }

  public Element bold(Element pare, Text fill)
  {
    return attribute(pare, fill, "BOLD");
  }

  public Element bold(Text fill)
  {
    return bold(null, fill);
  }

  public Element center(Element pare, Element fill)
  {
    Element center = document.createElement("center");
    center.appendChild(fill);
    if (pare != null)
      pare.appendChild(center);
    return center;
  }

  public Element center(Element fill)
  {
    return center(null, fill);
  }

  public Element center(Element pare, Text fill)
  {
    Element center = document.createElement("center");
    center.appendChild(fill);
    if (pare != null)
      pare.appendChild(center);
    return center;
  }

  public Element center(Text fill)
  {
    return center(null, fill);
  }

  public Element addPageHeader(Element pare)
  {
    Element bh = document.createElement("pageheader");
    pare.appendChild(bh);
    return bh;
  }
  
  public Element addBlockHeader(Element pare)
  {
    Element bh = document.createElement("blockheader");
    pare.appendChild(bh);
    return bh;
  }

  public Element addBlockFooter(Element pare)
  {
    Element bf = document.createElement("blockfooter");
    pare.appendChild(bf);
    return bf;
  }

  public Element addDetail(Element pare)
  {
    Element bh = document.createElement("detail");
    pare.appendChild(bh);
    return bh;
  }
}
