
package inhiretence;

public class Client {
    private int clientId;
    private String clientName;
    private String clientAddress;
    private Account []accountList;
    private int count;
    Client(){
        this.clientId = -1;
        this.clientName = "null";
        this.clientAddress = "null";
    }
    Client(int clientId, String clientName, String clientAddress){
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.count = 0;
        this.accountList = new Account[5];
    }
    public String toString(){
        return "Id: "+this.clientId+" Name: "+this.clientName+" Address: "+this.clientAddress;
    }
    public StringBuilder toStrings(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
           sb.append(this.accountList[i].getNumber());
           sb.append(" "+this.accountList[i].getBalence());
        }
        return sb;
    }
    public void addAccount(Account account){
        this.accountList[count] = account;
        count++;
    }
}
