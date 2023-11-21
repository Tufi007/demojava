import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        w();
    }

    public static void a() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print('*');
                j++;
            }

            i++;
            System.out.println();
        }
    }

    public static void b() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void c() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = n;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            i++;
            System.out.println();
        }

    }

    public static void d() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void e() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {

                System.out.print(i);

                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void f() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        int p = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(p);
                p += 1;
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void g() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        int p;
        while (i <= n) {
            int j = 1;
            p = i;
            while (j <= i) {

                System.out.print(p);
                j++;
                p++;
            }
            i++;
            System.out.println();
        }

    }

    public static void h() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;

        while (i <= n) {
            int j = 1;
            int p = n;
            while (j <= i) {

                System.out.print(p);
                p--;
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void i() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            int p = i;
            while (j <= i) {
                System.out.print(p);
                j++;
                p--;
            }
            i++;
            System.out.println();
        }

    }

    public static void j() {
        Scanner s = new Scanner(System.in);

        long n = s.nextLong();

        int sum = 0;
        int d;
        while (n > 0) {
            d = (int) n % 10;
            n = n / 10;
            sum = sum + d;

        }
        System.out.println(sum);

    }

    public static void k() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {

                System.out.print(((char) ('A' + j - 1)));
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void l() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {

                System.out.print(((char) ('A' + j - 1)));
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void m() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            int p = i;
            while (j <= i) {

                System.out.print(((char) ('A' + p - 1)));
                p += 1;
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void n() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            int p = n;
            while (j <= i) {

                System.out.print(((char) ('A' + p - 1)));
                p -= 1;
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void p() {
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt();
        i = 1;
        while (i <= n) {
            int j = 1;
            int p = n - i + 1;
            while (j <= i) {

                System.out.print(((char) ('A' + p - 1)));
                p += 1;
                j++;
            }
            i++;
            System.out.println();
        }

    }

    public static void q() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int p = n - i + 1;
            while (j <= p) {
                System.out.print('*');
                j++;

            }
            i++;

            System.out.println();

        }
    }

    public static void r() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int p = n - i + 1;
            while (j <= p) {
                System.out.print(p);
                j++;

            }
            i++;

            System.out.println();

        }
    }

    public static void s() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int k = n - i;
            while (k >= 1) {
                System.out.print(' ');
                k--;
            }
            int p = i;
            while (p >= 1) {
                System.out.print('*');
                p--;
            }
            System.out.println();
            i += 1;

        }
    }
    public static void t() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int k = n - i;
            while (k >= 1) {
                System.out.print(' ');
                k--;
            }
            int p=1;
            while (p <= i) {
                System.out.print(p);
                p++;
            }
            System.out.println();
            i += 1;

        }
    }
    public static void u() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int k = n - i;
            while (k >= 1) {
                System.out.print(' ');
                k--;
            }
            int p=1;
            while (p <= i) {
                System.out.print(p);
                p++;
            }
            int j=i-1;
            while (j>=1) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i += 1;

        }
    }
    public static void v() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int k = n - i;
            while (k >= 1) {
                System.out.print(' ');
                k--;
            }
            int p=1;
            while (p <= i) {
                System.out.print('*');
                p++;
            }
            int j=i-1;
            while (j>=1) {
                System.out.print('*');
                j--;
            }
            System.out.println();
            i += 1;

        }
    }
    public static void w() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int k = n - i;
            while (k >= 1) {
                System.out.print(' ');
                k--;
            }
            int p=1;
            int q=i;
            while (p <= i) {
                
                System.out.print(q);
                q++;
                p++;
            }
            int j=i-1;
            int r=2*i-2;
            while (j>=1) {
                System.out.print(r);
                r--;
                j--;
            }
            System.out.println();
            i += 1;

        }
    }
    public static void x() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int k = n - i;
            while (k >= 1) {
                System.out.print(' ');
                k--;
            }
            int p=1;
            while (p <= i) {
                System.out.print('*');
                p++;
            }
            int j=i-1;
            while (j>=1) {
                System.out.print('*');
                j--;
            }
            System.out.println();
            i += 1;

        }
        while (i<=n) {
            
        }
    }
}