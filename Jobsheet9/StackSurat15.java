package Jobsheet9;

public class StackSurat15 {
    Surat15[] stack;
    int top;
    int size;

    public StackSurat15(int size) {
        this.size = size;
        stack = new Surat15[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Surat15 srt){
        if (!isFull()){
            top++;
            stack[top] = srt;
        }else{
            System.out.println("Stack penuh! tidak bisa menambahkan suratlagi");
        }
    }

    public Surat15 pop(){
        if (!isEmpty()){
            Surat15 s = stack[top];
            top--;
            return s;
        }else {
            System.out.println("Stack kosong! tidak ada surat untuk dinilai");
            return null;
        }
    }

    public Surat15 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa  + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }
}
