package lec7;

//public void add(T newVal) {
//       if (head == null) {
//           head = new Element(newVal);
//       }
//
//       Element next = new Element(newVal);
//       Element current = head;
//
//       if (current != null) {
//           while (current.getNext() != null) {
//               current = current.getNext();
//           }
//
//           current.setNext(next);
//       }
//
//       increaseListSize();
//
//   }
//
//public Object remove(int i) {
//       if (i < 1 || i > LinkedList.size())
//           return null;
//
//       Element current = head;
//       if (head != null) {
//           for (int e = 0; e < i; i++) {
//               if (current.getNext() == null)
//                   return null;
//
//               current = current.getNext();
//           }
//           current.setNext(current.getNext().getNext());
//
//       }
//       return null;
//   }
//
////public int dequeue()
////{
////int data = front.data;
////front = front.next;
////if (isEmpty())
////{
////rear = null;
////}
////currentSize--;
////System.out.println(data+ " removed from the queue");
////return data;
////}
////
//////Add data to the end of the list.
////public void enqueue(int data)
////{
////Node oldRear = rear;
////rear = new Node();
////rear.data = data;
////rear.next = null;
////if (isEmpty())
////{
////front = rear;
////}
////else
////{
////oldRear.next = rear;
////}
//currentSize++;
//System.out.println(data+ " added to the queue");
//}