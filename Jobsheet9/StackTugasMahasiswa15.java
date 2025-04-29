package Jobsheet9;

public class StackTugasMahasiswa15 {
    Mahasiswa15[] stack;
    int top;
    int size;

    public StackTugasMahasiswa15(int size) {
        this.size = size;
        stack = new Mahasiswa15[size];
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

    public void push(Mahasiswa15 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa15 pop(){
        if (!isEmpty()){
            Mahasiswa15 m = stack[top];
            top--;
            return m;
        }else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa15 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa15 peekBottom(){
        if (!isEmpty()) {
            return stack[top - top]; 
        }else{
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public void jumlahTugas(){
        System.out.println("Total tugas yang dikumpulkan: " + (top + 1));
    }
}
