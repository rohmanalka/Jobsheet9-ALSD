package Tugas;

public class Queue21 {
    Pasien21[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue21(int n) {
        max = n;
        antrian = new Pasien21[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Pasien21 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pasien21 dequeue() {
        Pasien21 dt = new Pasien21();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }   

    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : "+antrian[front].nama
            +" "+antrian[front].alamat+" "+antrian[front].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if(!isEmpty()){
            System.out.println("Elemen paling belakang : "+antrian[rear].nama+
                " "+antrian[rear].alamat+" "+antrian[rear].umur);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println(antrian[i].nama + " " + antrian[i].alamat + " "+ antrian[i].umur);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].alamat + " "+ antrian[i].umur);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public int peekPosition(String nama) {
        if (isEmpty()) {
          return -1;
        }
    
        int i = front;
        int position = 0;
        while (i != rear) {
          if (antrian[i].nama.equals(nama)) {
            System.out.println(antrian[i].nama + " " + antrian[i].alamat + " "+ antrian[i].umur);
            return position;
          }
          position++;
          i = (i + 1) % max;
        }
    
        if (antrian[i].nama.equals(nama)) {
            System.out.println(antrian[i].nama + " " + antrian[i].alamat + " "+ antrian[i].umur);
          return position;
        }
        return -1;
      }

    public void daftarPasien() {
        if (isEmpty()) {
          System.out.println("Daftar pasien masih kosong");
        } else {
          int i = front;
          while (i != rear) {
            System.out.println(antrian[i].nama + " " + antrian[i].alamat + " "+ antrian[i].umur);
            i = (i + 1) % max;
          }
         
          System.out.println(antrian[i].nama + " " + antrian[i].alamat + " "+ antrian[i].umur);
        }
      }
}