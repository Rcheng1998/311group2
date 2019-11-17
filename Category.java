
package sprint1;

public class Category {
    String name;
    String branch;
    //make branch 4 pre defined things?^
    int numNotes;

    public Category(String name, String branch, int numNotes) {
        this.name = name;
        this.branch = branch;
        this.numNotes = numNotes;
    }

    public Category(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getNumNotes() {
        return numNotes;
    }

    public void setNumNotes(int numNotes) {
        this.numNotes = numNotes;
    }
}
