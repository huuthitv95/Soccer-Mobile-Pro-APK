package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.X2 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11743X2 extends InterfaceC11437Fb<Integer, Integer> {

    /* JADX INFO: renamed from: com.ironsource.X2$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f26119a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f26120b = 3009;

        /* JADX INFO: renamed from: c */
        public static final int f26121c = 3008;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X2$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f26122a = new b();

        /* JADX INFO: renamed from: b */
        public static final int f26123b = 3002;

        /* JADX INFO: renamed from: c */
        public static final int f26124c = 3005;

        /* JADX INFO: renamed from: d */
        public static final int f26125d = 3300;

        /* JADX INFO: renamed from: e */
        public static final int f26126e = 3503;

        /* JADX INFO: renamed from: f */
        public static final int f26127f = 3504;

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X2$c */
    public static final class c implements InterfaceC11743X2 {
        @Override // com.ironsource.InterfaceC11437Fb
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo25577a(Integer num) {
            return m27856a(num.intValue());
        }

        /* JADX INFO: renamed from: a */
        public Integer m27856a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = b.f26126e;
            } else if (i == 207) {
                i2 = b.f26127f;
            } else if (i == 405) {
                i2 = 3009;
            } else if (i != 406) {
                switch (i) {
                    case 101:
                        i2 = 83500;
                        break;
                    case 102:
                        i2 = 83510;
                        break;
                    case 103:
                        i2 = d.f26135h;
                        break;
                    case 104:
                        i2 = 83300;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case 110:
                                i2 = 83004;
                                break;
                            case 111:
                                break;
                            case 112:
                                i2 = 3305;
                                break;
                            case 113:
                                i2 = 3306;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 3002;
                                        break;
                                    case 202:
                                        i2 = 3005;
                                        break;
                                    case 203:
                                        i2 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i);
                                }
                                break;
                        }
                    case 105:
                        i2 = 83302;
                        break;
                }
            } else {
                i2 = 3008;
            }
            return Integer.valueOf(i2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.X2$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f26128a = new d();

        /* JADX INFO: renamed from: b */
        public static final int f26129b = 83500;

        /* JADX INFO: renamed from: c */
        public static final int f26130c = 83510;

        /* JADX INFO: renamed from: d */
        public static final int f26131d = 83300;

        /* JADX INFO: renamed from: e */
        public static final int f26132e = 83302;

        /* JADX INFO: renamed from: f */
        public static final int f26133f = 83004;

        /* JADX INFO: renamed from: g */
        public static final int f26134g = 88002;

        /* JADX INFO: renamed from: h */
        public static final int f26135h = 83301;

        /* JADX INFO: renamed from: i */
        public static final int f26136i = 83302;

        /* JADX INFO: renamed from: j */
        public static final int f26137j = 3305;

        /* JADX INFO: renamed from: k */
        public static final int f26138k = 3306;

        private d() {
        }
    }
}
