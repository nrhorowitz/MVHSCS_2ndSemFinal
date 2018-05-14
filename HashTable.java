public class HashTable<E> {
   private DLList<E>[] table;
   @SuppressWarnings("unchecked")
   public HashTable(int size) {
      table = new DLList[size];
      for(int i=0; i<table.length; i++) {
         table[i] = new DLList<E>();
      }
   }
   public void add(E myData) {
      table[myData.hashCode()].add(myData);
   }
   public void remove(E myData) {
      table[myData.hashCode()].remove(myData);
   }
   public DLList<E> getList(int index) {
      return table[index];
   }
   public E get(int index) {
	   return table[index].get(index);
   }
   public int size() {
	   int size = 0;
	   for(int i=0; i<table.length; i++) {
		   if(table[i] != null) {
			   size++;
		   }
	   }
	   return size;
   }
   public String toString() {
      String total = "";
      for(int i=0; i<table.length; i++) {
         total += "\nbucket " + i;
         for(int j=0; j<table[i].size(); j++) {
            total += " " + table[i].get(j);
         }
      }
      return total;
   }
}