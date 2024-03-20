class MedianFinder {

    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (max.isEmpty() || num <= max.peek())
            max.add(num);
        else
            min.add(num);

        if (min.size() > max.size())
            max.add(min.poll());
        else if (max.size() - min.size() > 1)
            min.add(max.poll());

    }

    public double findMedian() {
        if (max.size() == min.size())
            return (double) (max.peek() + min.peek()) / 2;
        return (double) max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */