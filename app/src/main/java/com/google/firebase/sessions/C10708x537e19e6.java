package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory */
/* JADX INFO: loaded from: classes6.dex */
public final class C10708x537e19e6 implements Factory<SessionGenerator> {
    @Override // javax.inject.Provider
    public SessionGenerator get() {
        return sessionGenerator();
    }

    public static C10708x537e19e6 create() {
        return InstanceHolder.INSTANCE;
    }

    public static SessionGenerator sessionGenerator() {
        return (SessionGenerator) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionGenerator());
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory$InstanceHolder */
    private static final class InstanceHolder {
        private static final C10708x537e19e6 INSTANCE = new C10708x537e19e6();

        private InstanceHolder() {
        }
    }
}
