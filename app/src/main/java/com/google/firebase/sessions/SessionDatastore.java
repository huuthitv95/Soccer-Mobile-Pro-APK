package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.ironsource.C12434q2;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.fid.Constants;
import kotlin.Metadata;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, m43475d2 = {"Lcom/google/firebase/sessions/SessionDatastore;", "", "getCurrentSessionId", "", "updateSessionId", "", JsonStorageKeyNames.SESSION_ID_KEY, "Companion", "com.google.firebase-firebase-sessions"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface SessionDatastore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    String getCurrentSessionId();

    void updateSessionId(String sessionId);

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m43475d2 = {"Lcom/google/firebase/sessions/SessionDatastore$Companion;", "", "()V", C12434q2.f31744p, "Lcom/google/firebase/sessions/SessionDatastore;", Constants.GET_INSTANCE, "()Lcom/google/firebase/sessions/SessionDatastore;", "com.google.firebase-firebase-sessions"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SessionDatastore getInstance() {
            return ((FirebaseSessionsComponent) FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessionsComponent.class)).getSessionDatastore();
        }
    }
}
