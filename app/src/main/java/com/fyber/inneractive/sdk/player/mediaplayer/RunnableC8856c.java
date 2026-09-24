package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8856c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8869p f20798a;

    public RunnableC8856c(C8869p c8869p) {
        this.f20798a = c8869p;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21945a("%sCannot wait for video size anymore", this.f20798a.m21413b());
        C8869p c8869p = this.f20798a;
        if (c8869p.f20830r == 0) {
            IAlog.m21945a("%sCannot wait for video size anymore. duration is still 0 - aborting", c8869p.m21413b());
            C8869p c8869p2 = this.f20798a;
            c8869p2.onError(c8869p2, 0, 0);
        } else {
            IAlog.m21945a("%sCannot wait for video size anymore. moving into ready", c8869p.m21413b());
            C8869p c8869p3 = this.f20798a;
            c8869p3.f20818f = true;
            c8869p3.m21414c();
        }
    }
}
