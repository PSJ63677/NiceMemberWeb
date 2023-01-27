package notice.model.vo;

import java.util.List;

public class PageData {
	private List<Notice> nList;
	private String pageNavigator;
	
	public List<Notice> getnList() {
		return nList;
	}
	public void setnList(List<Notice> nList) {
		this.nList = nList;
	}
	public String getPageNavigator() {
		return pageNavigator;
	}
	public void setPageNavigator(String pageNavigator) {
		this.pageNavigator = pageNavigator;
	}
	
}
