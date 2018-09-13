package mae.general.jreports;

import java.util.ArrayList;

public class Group {

	private boolean hasGroupHeader = false;
	private boolean hasGroupFooter = false;
	public ArrayList <Band> bandsHeader = new ArrayList<>();
	public ArrayList <Band> bandsFooter= new ArrayList<>();
	private String groupName;
	private boolean startInNewPage = false;
	private boolean reprintHeaderOnEachPage = false;
	private int minHeightToStartNewPage = 0;
	private String groupExpresion;

	
	public Group(String groupName) {
		this.setGroupName(groupName);		
	}


	public String getGroupName() {
		return groupName;
	}

	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public void addBandHeader(Band band) {
		bandsHeader.add(band);
		setHasGroupHeader(true);
	}

	public void addBandFooter(Band band) {
		bandsFooter.add(band);
	}

	public boolean isStartInNewPage() {
		return startInNewPage;
	}


	public void setStartInNewPage(boolean startInNewPage) {
		this.startInNewPage = startInNewPage;
	}


	public boolean isHasGroupHeader() {
		return hasGroupHeader;
	}


	public void setHasGroupHeader(boolean hasGroupHeader) {
		this.hasGroupHeader = hasGroupHeader;
	}


	public boolean isHasGroupFooter() {
		return hasGroupFooter;
	}


	public void setHasGroupFooter(boolean hasGroupFooter) {
		this.hasGroupFooter = hasGroupFooter;
	}


	public int getMinHeightToStartNewPage() {
		return minHeightToStartNewPage;
	}


	public void setMinHeightToStartNewPage(int minHeightToStartNewPage) {
		this.minHeightToStartNewPage = minHeightToStartNewPage;
	}


	public String getGroupExpresion() {
		return groupExpresion;
	}


	public void setGroupExpresion(String groupExpresion) {
		this.groupExpresion = groupExpresion;
	}


	public boolean isReprintHeaderOnEachPage() {
		return reprintHeaderOnEachPage;
	}


	public void setReprintHeaderOnEachPage(boolean reprintHeaderOnEachPage) {
		this.reprintHeaderOnEachPage = reprintHeaderOnEachPage;
	}
}
