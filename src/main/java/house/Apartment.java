package house;

abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);

    void upgrade() {
        squareFootage += 40;
    }
}