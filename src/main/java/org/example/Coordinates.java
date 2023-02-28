package org.example;

class Coordinates
{
    int x;
    int y;
    Coordinates(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    Coordinates(Coordinates object)
    {
        x=object.x;
        y=object.y;
    }
}
class Check
{
    boolean check(int x,int y,int x1,int y1)
    {
        return x==x1 && y==y1;
    }
}
