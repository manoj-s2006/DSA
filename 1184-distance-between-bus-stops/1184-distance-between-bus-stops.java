class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dist=0;
        int n=distance.length;
        int total=0;
        while(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        for(int i=0;i<n;i++){
            total+=distance[i];
            if(i<destination&&i>=start){
                dist+=distance[i];
            }
        }
        return Math.min(dist, total-dist);
        
    }
}