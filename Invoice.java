package invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItem;
    private double pricePerItem;

    public Invoice(String pn, String pd, int qi, double pi){
        partNumber=pn;
        partDescription=pd;
        quantityOfItem=qi;
        pricePerItem=pi;
    }
    public void setPartNumber(String pn){
        this.partNumber=pn;
    }
    public String getPartNumber(){
        return this.partNumber;
    }
    public void setPartDescription(String pd){
        this.partDescription=pd;
    }
    public String getPartDescription(){
        return this.partDescription;
    }
    public void setQuantityOfItem(int q){
        if(q<0){
            this.quantityOfItem=0;
        }
        else{
            this.quantityOfItem=q;
        }
    }
    public int getQuantityOfItem(){
        return this.quantityOfItem;
    }
    public void setPricePerItem(double p){
        if(p<0){
            this.pricePerItem=0.0;
        }
        else{
            this.pricePerItem=p;
        }
    }
    public double getPricePerItem(){
        return this.pricePerItem;
    }
}
