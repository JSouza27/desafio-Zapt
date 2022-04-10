function primeFactors(number) {
  const list = [];
  let result = number;
  
  for (let n = 2; result !== 1; n++) {
    if (number % n === 0) {
      list.push(n);

      result /= n;
    }
  }

  return Math.max(...list);
}

primeFactors(600851475143);
