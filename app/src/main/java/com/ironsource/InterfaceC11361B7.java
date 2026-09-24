package com.ironsource;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.B7 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11361B7 {

    /* JADX INFO: renamed from: com.ironsource.B7$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final ArrayList<C12580w5> f23914a;

        /* JADX INFO: renamed from: b */
        private boolean f23915b;

        /* JADX INFO: renamed from: c */
        private int f23916c;

        /* JADX INFO: renamed from: d */
        private Exception f23917d;

        public a(ArrayList<C12580w5> arrayList) {
            this.f23915b = false;
            this.f23916c = -1;
            this.f23914a = arrayList;
        }

        /* JADX INFO: renamed from: a */
        public a m25417a(Exception exc) {
            return new a(this.f23914a, this.f23916c, this.f23915b, exc);
        }

        /* JADX INFO: renamed from: b */
        public ArrayList<C12580w5> m25420b() {
            return this.f23914a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m25421c() {
            return this.f23915b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f23915b + ", responseCode=" + this.f23916c + ", exception=" + this.f23917d + AbstractJsonLexerKt.END_OBJ;
        }

        /* JADX INFO: renamed from: a */
        public a m25418a(boolean z) {
            return new a(this.f23914a, this.f23916c, z, this.f23917d);
        }

        /* JADX INFO: renamed from: a */
        public a m25416a(int i) {
            return new a(this.f23914a, i, this.f23915b, this.f23917d);
        }

        /* JADX INFO: renamed from: a */
        public String m25419a() {
            if (this.f23915b) {
                return "";
            }
            return "rc=" + this.f23916c + ", ex=" + this.f23917d;
        }

        a(ArrayList<C12580w5> arrayList, int i, boolean z, Exception exc) {
            this.f23914a = arrayList;
            this.f23915b = z;
            this.f23917d = exc;
            this.f23916c = i;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo25415a(a aVar);
}
