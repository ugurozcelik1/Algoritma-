import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("Doğum ayınızı sayı olarak giriniz: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();
        String burc = "";
        boolean isError = false;

        if(month == 1){
            if(day<1 || day>31){
                isError = true;
            }else {
                if (day <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            }
        }else if(month == 2) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            }
        }else if(month == 3) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            }
        }else if(month == 4) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            }
        }else if(month == 5) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            }
        }else if(month == 6) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            }
        }else if(month == 7) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            }
        }else if(month == 8) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            }
        }else if(month == 9) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            }
        }else if(month == 10) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            }
        }else if(month == 11) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day<=21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            }
        }else if(month == 12) {
            if (day < 1 || day > 31) {
                isError = true;
            } else {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            }
        }else{
            isError = true;
        }
        if(isError){
            System.out.println("Hatalı bir giriş yaptınız.");
        }else{
            System.out.println("Burcunuz: " + burc);
        }
    }
}
