# FINSERV-4159: Investigate bulk data import corrupting records

**Status:** In Progress · **Priority:** Critical
**Sprint:** Sprint 26 · **Story Points:** 8
**Reporter:** Rajesh Kumar (Data Team Lead) · **Assignee:** You (Intern)
**Labels:** `backend`, `java`, `import`, `investigation`
**Task Type:** Code Debugging

---

## Description

The bulk import tool is silently corrupting data. Records that pass validation come out different after import.

**DEBUGGING task — no hint comments.**

## Symptoms

- CSV with 1000 rows imported, but only 950 unique records (50 duplicates appear)
- Phone numbers with leading zeros lose the zero (`09876` becomes `9876`)
- Error recovery after a failed batch re-processes already-imported records

## Acceptance Criteria

- [ ] Root cause found and fixed
- [ ] All unit tests pass
