public class DoublyLinkedList {
    private item head;
    private item tail;
    private int length;
    public static class item{
        public int val ;
        public item next,prev;
        public item(int val){
            this.val = val;
        }
    }
    public int get(int index){
        item  result = getItemByIndex(index);
        if(result != null){
            return result.val;
        }
        return -1;
    }
    private item getItemByIndex(int index) {
        if (length > 0 && index < length) {
            if (index == 0) return head;
            if (index == length - 1) return tail;
            item result;
            // we choose how to get to the desired element faster. Begin with head or tail
            if (index > (length / 2)) {
                result = tail;
                for (int i = length - 1; i > index; i--) {
                    result = result.prev;
                }
            } else {
                result = head;
                for (int i = 1; i <= index; i++) {
                    result = result.next;
                }

            }
            return result;
        }
        return null;
    }
    public void addAtHead(int val){
        if(length>0){
            item temp = head;
            head = new item(val);
            head.next = temp;
            temp.prev = head;
        }else{
            head = new item(val);
            tail = head;
        }
        length++;
    }
    public void addAtTail(int val){
        if(length>0){
            item temp = tail;
            tail = new item(val);
            tail.prev = temp;
            temp.next = tail;
        }else{
            tail = new item(val);
            head = tail;
        }
        length++;
    }
    public void addAtIndex(int index,int val){
        if(index<0 || index>length){
            return;
        }
        if(index == 0){
            addAtHead(val);
        }
        else if(index == length){
            addAtTail(val);
        }
        else{
            item result = getItemByIndex(index);
            if(result != null){
                item temp = new item(val);
                temp.prev = result.prev;
                result.prev.next = temp;
                temp.next = result;
                result.prev = temp;
                length++;
            }
        }
    }
    public void deleteAtIndex(int index){
        if(index<0 || index>length){
            return;
        }
        if(index == 0){
            if(length == 1){
                head = null;
                tail = null;
            }else{
                head = head.next;
                if(length>2){
                    head.next.prev = head;
                }
            }
           length--;
        }else if(index == length-1){
            tail = tail.prev;
            if(length>2){
                tail.next.prev = tail;
            }
            length--;
        }else{
            item result = getItemByIndex(index);
            if(result != null){
                result.prev.next =result.next;
                result.next.prev = result.prev;
                length--;
            }
        }
    }
    public int getLength() {
        return length;
    }

}
