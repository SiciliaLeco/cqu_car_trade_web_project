package org.cqu.dto;

public class Node {
    Integer cid;
    Integer sellAmount;
    public Node(int cid, int sellAmount) {
        // 车辆ID以及销量，销量作为排序标准
        this.cid = cid;
        this.sellAmount = sellAmount;
    }

    public void setCid(Integer id) {this.cid = id;}
    public Integer getCid() {return cid;}
    public void setSellAmount(Integer amount) {this.sellAmount = amount;}
    public Integer getSellAmount() {return sellAmount;}
}
