class TimeCalculator {
    int dG(int a) {
        int dG = a * 24;
        return dG;
    }
    int dGms (int a, int b, int c, int d) {
        int dGms = (a * 86400) + (b * 3600) + (c * 60) + d;
        return dGms;
    }
    double sM (int a) {
        double sM = a / 60.0;
        return sM;
    }

    }