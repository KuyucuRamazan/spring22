package day24;

//TO make interfaces parent of a concrete class, use "implements" keyword instead of "extends"
public class Civic implements HondaAC, Engine, Security{
    @Override
    public void cool() {

    }

    @Override
    public void bacteriaKiller() {
        HondaAC.super.bacteriaKiller();
    }

    @Override
    public void run() {

    }
}
