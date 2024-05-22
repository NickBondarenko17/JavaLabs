class Phone {
    String number, model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() {
        this.number = "Невідомий";
        this.model = "Невідома";
        this.weight = 0;
    }

    public void ReceiveCall(String callName) {
        System.out.println("Дзвонить " + callName);
    }

    public void ReceiveCall(String callName, String callNumber) {
        System.out.println("Дзвонить " + callName + " з номеру " + callNumber);
    }

    public String GetNumber() {
        return number;
    }

    public void SendMessage(String... phoneNumbers) {
        System.out.print("Надіслано повідомлення на номери: ");

        for (String phoneNumber : phoneNumbers) {
            System.out.print(phoneNumber + " ");
        }
    }
}

class Task2 implements TaskInterface{
    public void StartTask() {
        Phone phone1 = new Phone("3801114334534", "Kalvin", 0.1);
        Phone phone2 = new Phone("380345345", "Bond");
        Phone phone3 = new Phone();

        PrintPhoneCharacteristics(phone1);
        PrintPhoneCharacteristics(phone2);
        PrintPhoneCharacteristics(phone3);

        System.out.println();
        phone1.ReceiveCall("Andriy");
        phone3.ReceiveCall("Baza", "3803245334");

        System.out.println();
        System.out.println(phone1.GetNumber());
        System.out.println(phone2.GetNumber());
        System.out.println(phone3.GetNumber());

        System.out.println();
        phone2.SendMessage(phone1.GetNumber(), "380434556411", "380563445324");
    }

    private void PrintPhoneCharacteristics(Phone phone) {
        System.out.print("Номер: " + phone.number);
        System.out.print(" Модель: " + phone.model);
        System.out.print(" Вага: " + phone.weight);
        System.out.println();
    }
}
