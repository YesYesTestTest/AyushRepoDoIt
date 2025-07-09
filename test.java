package com.armorcode.authserver.processor.impl;
import com.armorcode.authserver.models.SyncGitReposEventJfcDto;
public class SyncGitDetailsJobProcessor {
    public void process(SyncGitReposEventJfcDto event) {
        // This will throw NullPointerException if getBusinessUnitId() returns null
        long businessUnitId = event.getBusinessUnitId().longValue();
        System.out.println("Processing business unit ID: " + businessUnitId);
    }
    public static void main(String[] args) {
        SyncGitReposEventJfcDto dto = new SyncGitReposEventJfcDto();
        new SyncGitDetailsJobProcessor().process(dto);  // Triggers the exception
    }
}
