package cn.absalom.tmall.util;

public class Page {
    private int start;
    private int count;
    private int total;
    private int last;
    private String param;
    private static final int defaultCount = 5;
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }


    public void setLast(int last) {
        this.last = last;
    }
    public int getLast() {
        int last;
        if (0 == total%count){
            last = total - count;
        }
        else {
            last = total - total % count;
        }
        last = last<0 ? 0 : last;
        return  last;
    }


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public Page(){
        count = defaultCount;
    }
    public Page(int start,int count){
        super();
        this.start = start;
        this.count = count;
    }
    /*
    * 判断是否一页
    * */
    public boolean isHasPreviouse(){
        if (start == 0)
            return false;
        return true;
    }

    public boolean isHasNext() {
        if (start == getLast())
            return false;
        return true;
    }
    public int getTotalPage(){
        int totalPage;
        //5的倍数
        if (0 == total % count){
            totalPage = total / count; //N页
        }
        else {
            totalPage = total / count + 1 ;//N+1页
        }
        return totalPage;
    }



    @Override
    public String toString() {
        return "Page [start="+ start + ", count="+ count + ",total=" + total + ",getStart()=" + getStart() + ",getCount()=" + getCount() + "" +
                ",getTotal()="+ getTotal () + ",isHasPreviouse()="+ isHasPreviouse() + ",isHasNext()="+ isHasNext() + "," +
                "getTotalPage()="+ getTotalPage() + ",getLast()="+ getLast() + "]";
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}
