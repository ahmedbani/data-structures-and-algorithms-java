package stacks.queues;

import java.util.Locale;

public class AnimalShelter extends Queue{
    Queue dogs = new Queue();
    Queue cats = new Queue();

    public Queue getDogs() {
        return dogs;
    }

    public Queue getCats() {
        return cats;
    }

    public void setDogs(Queue dogs) {
        this.dogs = dogs;
    }

    public void setCats(Queue cats) {
        this.cats = cats;
    }

    public void enqueue(Animal pref){
        try {
            if(pref instanceof Cats){
                cats.enqueue(pref);
            }
            else if (pref instanceof Dogs){
                dogs.enqueue(pref);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public Object dequeue(String pref){
        if (pref.toLowerCase(Locale.ROOT) == "dog")
            if (dogs.isEmpty())
                return "there is no dogs";
            else
                 return dogs.dequeue();
        else if(pref.toLowerCase(Locale.ROOT) == "cat")
            if (cats.isEmpty())
                return "there is no cats";
            else
                return cats.dequeue();
        else return null;
    }

    @Override
    public String toString() {
        return
                "dogs=" + dogs.toString() +
                ", cats=" + cats.toString() ;
    }
}
