package youlike.domain.entity;

public class QueryPageInfoPo {

    private int pagesize = 10; //每页多少条信息
    private int startindex; //当前页数据在数据库的起始位置

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getStartindex() {
        return startindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }
}
