public class Main {
    public static void main(String[] args) {

        //������� 1
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if(clientOS == 1) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }

        //������� 2
        clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if(clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if(clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }

        //������� 3
        int year = 2120;
        if ((year%4 != 0  || year%100 == 0) && year%400 != 0) {
            System.out.println(year + " ��� �� �������� ����������");
        } else  {
            System.out.println(year + " ��� �������� ����������");
        }

        //������� 4
        int deliveryDistance = 95;
        int deysForDelivery = 0;
        if (deliveryDistance <= 20) {
            deysForDelivery = 1;
        } else if (deliveryDistance <= 60) {
            deysForDelivery = 2;
        } else if (deliveryDistance <= 100) {
            deysForDelivery = 3;
        }
        System.out.println("����������� ����: " + deysForDelivery);

        //������� 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }
    }
}