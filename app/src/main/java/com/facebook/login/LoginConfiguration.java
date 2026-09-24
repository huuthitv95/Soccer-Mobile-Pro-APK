package com.facebook.login;

import com.facebook.internal.ServerProtocol;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoginConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB!\b\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m43475d2 = {"Lcom/facebook/login/LoginConfiguration;", "", "permissions", "", "", ServerProtocol.DIALOG_PARAM_NONCE, "(Ljava/util/Collection;Ljava/lang/String;)V", "getNonce", "()Ljava/lang/String;", "", "getPermissions", "()Ljava/util/Set;", "Companion", "facebook-common_release"}, m43476k = 1, m43477mv = {1, 5, 1}, m43479xi = 48)
public final class LoginConfiguration {
    public static final String OPENID = "openid";
    private final String nonce;
    private final Set<String> permissions;

    /* JADX WARN: Multi-variable type inference failed */
    public LoginConfiguration(Collection<String> collection) {
        this(collection, null, 2, 0 == true ? 1 : 0);
    }

    public LoginConfiguration(Collection<String> collection, String nonce) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        NonceUtil nonceUtil = NonceUtil.INSTANCE;
        if (!NonceUtil.isValidNonce(nonce)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(permissions)");
        this.permissions = setUnmodifiableSet;
        this.nonce = nonce;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoginConfiguration(Collection collection, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Set<String> getPermissions() {
        return this.permissions;
    }
}
