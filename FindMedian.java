import java.util.*;
class FindMedian {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public FindMedian(){
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        minHeap = new PriorityQueue<Integer>();
    }


    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
        }
        else{
            return maxHeap.peek();
        }
    }
   public static void main(String args[])
   {
       FindMedian obj = new FindMedian();
       obj.addNum(5);
       System.out.println(obj.findMedian());
       obj.addNum(10);
       System.out.println(obj.findMedian());
       obj.addNum(15);
       System.out.println(obj.findMedian());
   }
}
