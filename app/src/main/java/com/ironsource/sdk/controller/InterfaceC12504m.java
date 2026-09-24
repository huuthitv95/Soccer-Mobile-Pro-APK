package com.ironsource.sdk.controller;

import com.ironsource.C12386n8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.m */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12504m {

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.m$a */
    public static final class a implements InterfaceC12504m {

        /* JADX INFO: renamed from: a */
        private final String f32126a;

        /* JADX INFO: renamed from: b */
        private final String f32127b;

        /* JADX INFO: renamed from: c */
        private final String f32128c;

        /* JADX INFO: renamed from: d */
        private final String f32129d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall) {
            this(funToCall, null, null, null, 14, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.InterfaceC12504m
        /* JADX INFO: renamed from: a */
        public String mo33467a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.f32126a);
            String str = this.f32127b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.f32127b);
            }
            String str2 = this.f32128c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.f32128c);
            }
            String str3 = this.f32129d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.f32129d);
            }
            sb.append("');");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str) {
            this(funToCall, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str, String str2) {
            this(funToCall, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(String funToCall, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.f32126a = funToCall;
            this.f32127b = str;
            this.f32128c = str2;
            this.f32129d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.m$b */
    public static final class b implements InterfaceC12504m {

        /* JADX INFO: renamed from: a */
        private int f32130a;

        /* JADX INFO: renamed from: b */
        private String f32131b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC12504m jsMethod, int i) {
            this(jsMethod.mo33467a(), i);
            Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        public b(String script, int i) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.f32131b = script;
            this.f32130a = i;
        }

        @Override // com.ironsource.sdk.controller.InterfaceC12504m
        /* JADX INFO: renamed from: a */
        public String mo33467a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f32130a != C12386n8.d.MODE_0.m32820b() && (this.f32130a < C12386n8.d.MODE_1.m32820b() || this.f32130a > C12386n8.d.MODE_3.m32820b())) {
                str = "empty";
            }
            String str2 = "try{" + this.f32131b + "}catch(e){" + str + "}";
            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    String mo33467a();
}
