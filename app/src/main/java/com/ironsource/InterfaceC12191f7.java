package com.ironsource;

import com.facebook.internal.AnalyticsEvents;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f7 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12191f7 {

    /* JADX INFO: renamed from: com.ironsource.f7$a */
    public interface a extends InterfaceC12191f7 {

        /* JADX INFO: renamed from: com.ironsource.f7$a$a, reason: collision with other inner class name */
        public static final class C15539a implements a {

            /* JADX INFO: renamed from: a */
            private final Exception f30398a;

            public C15539a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f30398a = exception;
            }

            /* JADX INFO: renamed from: a */
            public final C15539a m31454a(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new C15539a(exception);
            }

            @Override // com.ironsource.InterfaceC12191f7.a
            /* JADX INFO: renamed from: b */
            public boolean mo31452b() {
                return true;
            }

            /* JADX INFO: renamed from: c */
            public final Exception m31455c() {
                return this.f30398a;
            }

            /* JADX INFO: renamed from: d */
            public final Exception m31456d() {
                return this.f30398a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C15539a) && Intrinsics.areEqual(this.f30398a, ((C15539a) obj).f30398a);
            }

            public int hashCode() {
                return this.f30398a.hashCode();
            }

            public String toString() {
                return "Exception(exception=" + this.f30398a + ")";
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ C15539a m31453a(C15539a c15539a, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = c15539a.f30398a;
                }
                return c15539a.m31454a(exc);
            }

            @Override // com.ironsource.InterfaceC12191f7.a
            /* JADX INFO: renamed from: a */
            public String mo31451a() {
                String message = this.f30398a.getMessage();
                if (message == null) {
                    message = "No message";
                }
                return "Exception - " + message;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f7$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a */
            private final int f30399a;

            /* JADX INFO: renamed from: b */
            private final String f30400b;

            public b(int i, String str) {
                this.f30399a = i;
                this.f30400b = str;
            }

            /* JADX INFO: renamed from: a */
            public final b m31458a(int i, String str) {
                return new b(i, str);
            }

            @Override // com.ironsource.InterfaceC12191f7.a
            /* JADX INFO: renamed from: b */
            public boolean mo31452b() {
                return this.f30399a != 400;
            }

            /* JADX INFO: renamed from: c */
            public final int m31459c() {
                return this.f30399a;
            }

            /* JADX INFO: renamed from: d */
            public final String m31460d() {
                return this.f30400b;
            }

            /* JADX INFO: renamed from: e */
            public final int m31461e() {
                return this.f30399a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f30399a == bVar.f30399a && Intrinsics.areEqual(this.f30400b, bVar.f30400b);
            }

            /* JADX INFO: renamed from: f */
            public final String m31462f() {
                return this.f30400b;
            }

            public int hashCode() {
                int i = this.f30399a * 31;
                String str = this.f30400b;
                return i + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "HttpError(errorCode=" + this.f30399a + ", errorMessage=" + this.f30400b + ")";
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ b m31457a(b bVar, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.f30399a;
                }
                if ((i2 & 2) != 0) {
                    str = bVar.f30400b;
                }
                return bVar.m31458a(i, str);
            }

            @Override // com.ironsource.InterfaceC12191f7.a
            /* JADX INFO: renamed from: a */
            public String mo31451a() {
                int i = this.f30399a;
                String str = this.f30400b;
                if (str == null) {
                    str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                }
                return "HTTP Error - Code: " + i + ", Message: " + str;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f7$a$c */
        public static final class c implements a {
            @Override // com.ironsource.InterfaceC12191f7.a
            /* JADX INFO: renamed from: a */
            public String mo31451a() {
                return "Parse Error - Unable to parse the response";
            }

            @Override // com.ironsource.InterfaceC12191f7.a
            /* JADX INFO: renamed from: b */
            public boolean mo31452b() {
                return true;
            }
        }

        /* JADX INFO: renamed from: a */
        String mo31451a();

        /* JADX INFO: renamed from: b */
        boolean mo31452b();
    }

    /* JADX INFO: renamed from: com.ironsource.f7$b */
    public static final class b implements InterfaceC12191f7 {

        /* JADX INFO: renamed from: a */
        private final String f30401a;

        public b(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f30401a = response;
        }

        /* JADX INFO: renamed from: a */
        public final b m31464a(String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new b(response);
        }

        /* JADX INFO: renamed from: c */
        public final String m31465c() {
            return this.f30401a;
        }

        /* JADX INFO: renamed from: d */
        public final String m31466d() {
            return this.f30401a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f30401a, ((b) obj).f30401a);
        }

        public int hashCode() {
            return this.f30401a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.f30401a + ")";
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m31463a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f30401a;
            }
            return bVar.m31464a(str);
        }
    }
}
