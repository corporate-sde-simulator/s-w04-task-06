# PR Review - Bulk data import with error recovery (by Sneha Jain)

## Reviewer: Pooja Reddy
---

**Overall:** Good foundation but critical bugs need fixing before merge.

### `BulkImporter.java`

> **Bug #1:** Batch commit happens before validation so invalid records are persisted to database
> This is the higher priority fix. Check the logic carefully and compare against the design doc.

### `ErrorRecovery.java`

> **Bug #2:** Error recovery checkpoint saves row number but does not save column state so resume skips fields
> This is more subtle but will cause issues in production. Make sure to add a test case for this.

---

**Sneha Jain**
> Acknowledged. I have documented the issues for whoever picks this up.
