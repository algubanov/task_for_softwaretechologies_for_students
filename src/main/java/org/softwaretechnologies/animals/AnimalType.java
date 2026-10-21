package org.softwaretechnologies.animals;

public enum AnimalType {
    CAT{
        @Override
        public Animal createAnimal() {
            return new Cat(null);
        }
    }, DOG{
        @Override
        public Animal createAnimal() {
            return new Dog(null);
        }
    }, COW{
        @Override
        public Animal createAnimal() {
            return new Cow(null);
        }
    };

    public abstract Animal createAnimal();

}
