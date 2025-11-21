print("P\tQ\tP OR Q")
for P in [True, False]:
    for Q in [True, False]:
        print(f"{P}\t{Q}\t{P or Q}")
