package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.C4237b;
import com.digitalturbine.ignite.authenticator.C4238c;
import com.digitalturbine.ignite.authenticator.IgniteManager;
import com.digitalturbine.ignite.authenticator.callbacks.BinderC4240b;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4253c;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.handlers.C4255a;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.logger.ILogger;
import com.digitalturbine.ignite.authenticator.parsers.C4261b;
import com.digitalturbine.ignite.authenticator.receiver.C4262a;
import com.digitalturbine.ignite.authenticator.utils.events.AbstractC4266a;
import com.digitalturbine.ignite.encryption.storage.C4272a;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C4248h extends AbstractC4246f {

    /* JADX INFO: renamed from: c */
    public C4238c f17330c;

    /* JADX INFO: renamed from: d */
    public IgniteManager f17331d;

    /* JADX INFO: renamed from: e */
    public final C4272a f17332e;

    /* JADX INFO: renamed from: f */
    public final C4261b f17333f;

    /* JADX INFO: renamed from: g */
    public C4237b f17334g;

    /* JADX INFO: renamed from: h */
    public C4255a f17335h;

    /* JADX INFO: renamed from: i */
    public final boolean f17336i;

    /* JADX INFO: renamed from: j */
    public final boolean f17337j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f17338k;

    public C4248h(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a, boolean z, boolean z2, AuthenticationServiceListener authenticationServiceListener, IgniteManager igniteManager) {
        super(interfaceServiceConnectionC4241a, authenticationServiceListener);
        this.f17336i = false;
        this.f17337j = false;
        this.f17338k = new AtomicBoolean(false);
        this.f17331d = igniteManager;
        this.f17336i = z;
        this.f17333f = new C4261b();
        this.f17332e = new C4272a(interfaceServiceConnectionC4241a.mo20289g());
        this.f17337j = z2;
        if (z2) {
            this.f17330c = new C4238c(interfaceServiceConnectionC4241a.mo20289g(), this, this);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20277a(ComponentName componentName, IBinder iBinder) {
        AuthenticationServiceListener authenticationServiceListener;
        boolean zMo20292j = this.f17328a.mo20292j();
        if (!zMo20292j && (authenticationServiceListener = this.f17329b) != null) {
            authenticationServiceListener.onOdtUnsupported();
        }
        if (this.f17330c != null && this.f17328a.mo20292j() && this.f17337j) {
            this.f17330c.m20276a();
        }
        if (zMo20292j || this.f17336i) {
            super.mo20277a(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20281b() {
        if (this.f17334g == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            ILogger iLogger = C4259a.f17346b.f17347a;
            if (iLogger != null) {
                iLogger.mo20305i("%s : initializing new Ignite authentication session", objArr);
            }
            C4272a c4272a = this.f17332e;
            c4272a.getClass();
            try {
                c4272a.f17358b.m20317a();
            } catch (IOException e) {
                e = e;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e3) {
                e = e3;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e4) {
                e = e4;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e6) {
                e = e6;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e7) {
                e = e7;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e8) {
                e = e8;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e9) {
                e = e9;
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e, EnumC4253c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e10) {
                C4252b.m20298a(EnumC4254d.ENCRYPTION_EXCEPTION, AbstractC4266a.m20312a(e10, EnumC4253c.FAILED_INIT_ENCRYPTION));
            }
            String strM20320a = this.f17332e.m20320a();
            this.f17333f.getClass();
            C4237b c4237bM20311a = C4261b.m20311a(strM20320a);
            this.f17334g = c4237bM20311a;
            if (c4237bM20311a.f17298b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                C4259a.m20308a("%s : One DT resolved from cache", "OneDTAuthenticator");
                C4237b c4237b = this.f17334g;
                IgniteManager igniteManager = this.f17331d;
                if (igniteManager != null) {
                    C4259a.m20308a("%s : setting one dt entity", "IgniteManager");
                    igniteManager.f17295b = c4237b;
                }
            } else {
                this.f17338k.set(true);
            }
        }
        if (this.f17337j && this.f17330c == null) {
            C4259a.m20309b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            mo20279a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f17336i && !this.f17338k.get()) {
            if (this.f17337j) {
                this.f17330c.m20276a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            ILogger iLogger2 = C4259a.f17346b.f17347a;
            if (iLogger2 != null) {
                iLogger2.mo20305i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f17328a.mo20281b();
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public final void mo20284c(String str) {
        super.mo20284c(str);
        if (this.f17328a.mo20290h() && this.f17338k.get() && this.f17328a.mo20292j()) {
            this.f17338k.set(false);
            m20296m();
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: d */
    public final String mo20286d() {
        InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a = this.f17328a;
        if (interfaceServiceConnectionC4241a instanceof AbstractC4246f) {
            return interfaceServiceConnectionC4241a.mo20286d();
        }
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    public final void destroy() {
        this.f17331d = null;
        C4238c c4238c = this.f17330c;
        if (c4238c != null) {
            C4262a c4262a = c4238c.f17299a;
            if (c4262a != null && c4262a.f17349b) {
                c4238c.f17300b.unregisterReceiver(c4262a);
                c4238c.f17299a.f17349b = false;
            }
            C4262a c4262a2 = c4238c.f17299a;
            if (c4262a2 != null) {
                c4262a2.f17348a = null;
                c4238c.f17299a = null;
            }
            c4238c.f17301c = null;
            c4238c.f17300b = null;
            c4238c.f17302d = null;
            this.f17330c = null;
        }
        C4255a c4255a = this.f17335h;
        if (c4255a != null) {
            BinderC4240b binderC4240b = c4255a.f17344b;
            if (binderC4240b != null) {
                binderC4240b.f17304a.clear();
                c4255a.f17344b = null;
            }
            c4255a.f17345c = null;
            c4255a.f17343a = null;
            this.f17335h = null;
        }
        this.f17329b = null;
        this.f17328a.destroy();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: i */
    public final String mo20291i() {
        InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a = this.f17328a;
        if (interfaceServiceConnectionC4241a instanceof AbstractC4246f) {
            return interfaceServiceConnectionC4241a.mo20291i();
        }
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: j */
    public final boolean mo20292j() {
        return this.f17328a.mo20292j();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: l */
    public final void mo20294l() {
        mo20281b();
    }

    /* JADX INFO: renamed from: m */
    public final void m20296m() {
        IIgniteServiceAPI iIgniteServiceAPIMo20293k = this.f17328a.mo20293k();
        if (iIgniteServiceAPIMo20293k == null) {
            C4259a.m20309b("%s : service is unavailable", "OneDTAuthenticator");
            C4252b.m20298a(EnumC4254d.ONE_DT_REQUEST_ERROR, "error_code", EnumC4253c.IGNITE_SERVICE_UNAVAILABLE.m20299a());
            return;
        }
        if (this.f17335h == null) {
            this.f17335h = new C4255a(iIgniteServiceAPIMo20293k, this);
        }
        if (TextUtils.isEmpty(this.f17328a.mo20287e())) {
            C4252b.m20298a(EnumC4254d.ONE_DT_REQUEST_ERROR, "error_code", EnumC4253c.IGNITE_SERVICE_INVALID_SESSION.m20299a());
            C4259a.m20309b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        C4255a c4255a = this.f17335h;
        String strMo20287e = this.f17328a.mo20287e();
        c4255a.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strMo20287e);
            c4255a.f17345c.getProperty("onedtid", bundle, new Bundle(), c4255a.f17344b);
        } catch (RemoteException e) {
            C4252b.m20297a(EnumC4254d.ONE_DT_REQUEST_ERROR, e);
            C4259a.m20309b("%s : request failed : %s", "OneDTPropertyHandler", e.toString());
        }
    }
}
