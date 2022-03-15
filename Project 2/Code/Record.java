/*
The record to store ID and value from a 16 bytes record
You will need a data structure to store Record in-order to
check and trace data
 */

import java.nio.ByteBuffer;

public class Record implements Comparable<Record> {
    private byte[] wholeRecord;

    public Record(byte[] record){
        wholeRecord = record;
    }

    //return the part of ID
    public int getID(){
        ByteBuffer buffer = ByteBuffer.wrap(wholeRecord);
        return buffer.getInt();
    }

    //return the part of key
    public double getKey(){
        ByteBuffer buffer = ByteBuffer.wrap(wholeRecord);
        return buffer.getDouble(8);
    }

    //return the whole Record
    public byte[] getWholeRecord(){
        return wholeRecord;
    }

    //comparision
    @Override
    public int compareTo(Record target) {
        return Double.compare(this.getKey(), target.getKey());
    }

    //output the record as a string
    public String toString() {
        return "" + this.getKey();
    }
}
