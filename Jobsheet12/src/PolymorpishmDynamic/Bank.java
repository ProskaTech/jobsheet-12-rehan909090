package PolymorpishmDynamic;

class Bank {
    float sukuBunga() {
        return 0;
    }
}

class BRI extends Bank {
    // overriding sukuBunga method
    float sukuBunga() {
        return 5.5f;
    }
}
