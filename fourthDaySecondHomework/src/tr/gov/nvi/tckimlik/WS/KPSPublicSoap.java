/**
 * KPSPublicSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;
import java.util.Date;

public interface KPSPublicSoap extends java.rmi.Remote {
    public boolean TCKimlikNoDogrula(long l, java.lang.String ad, java.lang.String soyad, Date date) throws java.rmi.RemoteException;

	boolean TCKimlikNoDogrula(long l, String ad, String soyad, String string2) throws RemoteException;

	boolean TCKimlikNoDogrula1(long l, String ad, String soyad, Date date) throws RemoteException;
}
