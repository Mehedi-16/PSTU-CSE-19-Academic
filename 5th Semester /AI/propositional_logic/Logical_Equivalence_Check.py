# Logical Equivalence: P → Q ≡ ~P v Q

print("P\tQ\tP → Q\t~P v Q\tEquivalent?")
for P in [True, False]:
    for Q in [True, False]:
        implies = (not P) or Q       # P → Q
        alt_form = (not P) or Q      # ~P v Q
        equivalent = implies == alt_form
        print(f"{P}\t{Q}\t{implies}\t{alt_form}\t{equivalent}")
