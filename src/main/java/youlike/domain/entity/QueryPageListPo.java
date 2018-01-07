package youlike.domain.entity;

import java.util.List;

public class QueryPageListPo<E> {

    private int pagenum;
    private int countPage;
    private List<E> listist = null;

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public List<E> getListist() {
        return listist;
    }

    public void setListist(List<E> listist) {
        this.listist = listist;
    }
}
