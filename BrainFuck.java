import java.util.ArrayList;

public class BrainFuck{
    private String[] commands;
    private ArrayList<Integer> Stack;
    private ArrayList<Integer[]> Memory;
    private Integer currentPointer;
    private Integer position;
    private ArrayList<Integer> activePointers;
    public BrainFuck(String programme){
        this.commands = getCommands(programme);
        this.Stack = new ArrayList<Integer>();
        this.Memory = new ArrayList<Integer[]>();
        this.activePointers = new ArrayList<Integer>();
        this.currentPointer = 0;
        this.position = 0;
    }
    public String[] getCommands(String commands){
        String splitCommands[] = new String[commands.length];
        char[] chararray = commands.toCharArray();
        for (int i = 0; i < commands.length; i++){
            if (splitCommands[i] == '>'){
                splitCommands[i] = "incPointer";
            }
            if (splitCommands[i] == '<'){
                splitCommands[i] = "decPointer";
            }
            if (splitCommands[i] == '+'){
                splitCommands[i] = "incValue";
            }
            if (splitCommands[i] == '-'){
                splitCommands[i] = "decValue";
            }
            if (splitCommands[i] == '['){
                splitCommands[i] = "whileStart";
            }
            if (splitCommands[i] == ']'){
                splitCommands[i] = "whileEnd";
            }
            if (splitCommands[i] == '.'){
                splitCommands[i] = "putChar";
            }
            if (splitCommands[i] == '.'){
                splitCommands[i] = "getChar";
            }
        }
    }
    public void execNextCommand(){
        if (this.commands[this.position] == "incValue"){
            for (int i = 0; i < this.Memory.length; i++){
                if (this.Memory.get(i)[0] == this.currentPointer){
                    Integer temp = this.memory.get(i)[1];
                    this.Memory.remove(i);
                    Integer temp2electricboogaloo[] = {currentPointer, temp + 1};
                    this.Memory.add(temp2electricboogaloo);
                }
            }
        }
        if (this.commands[this.position] == "decValue"){
            for (int i = 0; i < this.Memory.length; i++){
                if (this.Memory.get(i)[0] == this.currentPointer){
                    Integer temp = this.memory.get(i)[1];
                    this.Memory.remove(i);
                    Integer temp2electricboogaloo[] = {currentPointer, temp - 1};
                    this.Memory.add(temp2electricboogaloo);
                }
            }
        }
        if (this.commands[this.poisition] == "incPointer"){
            
        }
    }
}