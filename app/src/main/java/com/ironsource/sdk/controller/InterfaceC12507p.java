package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11564Mc;
import com.ironsource.C11582Nc;
import com.ironsource.C11744X3;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12201g;
import com.ironsource.InterfaceC12219h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.p */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12507p {

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b */
    public interface b {

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a */
            private final C11582Nc f32182a;

            /* JADX INFO: renamed from: b */
            private final InterfaceC12201g f32183b;

            public a(C11582Nc configurations, InterfaceC12201g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f32182a = configurations;
                this.f32183b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC12507p.b
            /* JADX INFO: renamed from: a */
            public c mo33472a(Context context, C11564Mc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.m26554d())) {
                    return new c.a("url is empty");
                }
                Intent intentMo31514a = this.f32183b.mo31514a();
                intentMo31514a.setData(Uri.parse(openUrl.m26554d()));
                String strM26553c = openUrl.m26553c();
                if (strM26553c != null && strM26553c.length() != 0) {
                    intentMo31514a = intentMo31514a.setPackage(openUrl.m26553c());
                    Intrinsics.checkNotNullExpressionValue(intentMo31514a, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentMo31514a = intentMo31514a.addFlags(this.f32182a.m26679c());
                }
                Intrinsics.checkNotNullExpressionValue(intentMo31514a, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentMo31514a);
                return c.b.f32190a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C15545b implements b {

            /* JADX INFO: renamed from: a */
            private final String f32184a;

            public C15545b(String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.f32184a = method;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC12507p.b
            /* JADX INFO: renamed from: a */
            public c mo33472a(Context context, C11564Mc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.a("method " + this.f32184a + " is unsupported");
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$c */
        public static final class c implements b {

            /* JADX INFO: renamed from: a */
            private final C11582Nc f32185a;

            /* JADX INFO: renamed from: b */
            private final InterfaceC12219h f32186b;

            public c(C11582Nc configurations, InterfaceC12219h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f32185a = configurations;
                this.f32186b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC12507p.b
            /* JADX INFO: renamed from: a */
            public c mo33472a(Context context, C11564Mc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.C12491e(this.f32186b).m33349a(this.f32185a.m26679c()).m33350a(openUrl.m26554d()).m33352b(true).m33353c(true).m33348a(context));
                return c.b.f32190a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$d */
        public static final class d implements b {

            /* JADX INFO: renamed from: a */
            private final C11582Nc f32187a;

            /* JADX INFO: renamed from: b */
            private final InterfaceC12219h f32188b;

            public d(C11582Nc configurations, InterfaceC12219h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.f32187a = configurations;
                this.f32188b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.InterfaceC12507p.b
            /* JADX INFO: renamed from: a */
            public c mo33472a(Context context, C11564Mc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.C12491e(this.f32188b).m33349a(this.f32187a.m26679c()).m33350a(openUrl.m26554d()).m33351a(this.f32187a.m26680d()).m33352b(true).m33348a(context));
                return c.b.f32190a;
            }
        }

        /* JADX INFO: renamed from: a */
        c mo33472a(Context context, C11564Mc c11564Mc);
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$c */
    public static abstract class c {

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$c$a */
        public static final class a extends c {

            /* JADX INFO: renamed from: a */
            private final String f32189a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX INFO: renamed from: a */
            public final String m33475a() {
                return this.f32189a;
            }

            /* JADX INFO: renamed from: b */
            public final String m33476b() {
                return this.f32189a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f32189a, ((a) obj).f32189a);
            }

            public int hashCode() {
                return this.f32189a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f32189a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f32189a = errorMessage;
            }

            /* JADX INFO: renamed from: a */
            public final a m33474a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ a m33473a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f32189a;
                }
                return aVar.m33474a(str);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$c$b */
        public static final class b extends c {

            /* JADX INFO: renamed from: a */
            public static final b f32190a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: a */
    c mo33471a(Context context, C11564Mc c11564Mc);

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$a */
    public static final class a implements InterfaceC12507p {

        /* JADX INFO: renamed from: a */
        private b f32181a;

        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        public a(String method, C11582Nc openUrlConfigurations, InterfaceC12219h activityIntentFactory, InterfaceC12201g actionIntentFactory) {
            b aVar;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int iHashCode = method.hashCode();
            if (iHashCode != -1455867212) {
                if (iHashCode != 109770977) {
                    if (iHashCode == 1224424441 && method.equals(C11744X3.i.f26336K)) {
                        aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                    } else {
                        aVar = new b.C15545b(method);
                    }
                } else if (method.equals(C11744X3.i.f26349U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                } else {
                    aVar = new b.C15545b(method);
                }
            } else if (method.equals(C11744X3.i.f26334J)) {
                aVar = new b.a(openUrlConfigurations, actionIntentFactory);
            } else {
                aVar = new b.C15545b(method);
            }
            this.f32181a = aVar;
        }

        @Override // com.ironsource.sdk.controller.InterfaceC12507p
        /* JADX INFO: renamed from: a */
        public c mo33471a(Context context, C11564Mc openUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.f32181a.mo33472a(context, openUrl);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                String message = e.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                Intrinsics.checkNotNull(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, C11582Nc openUrlConfigurations) {
            this(method, openUrlConfigurations, new InterfaceC12502k.c(), new InterfaceC12502k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
