function solution(number){
  let multiples = 0;
  const THREE = 3;
  const FIVE = 5;

  if (number <= 0) {
    return 0;
  }

  for(let i = 1; i < number; i++) {
    if (i % THREE === 0 || i % FIVE === 0) {
      multiples += i;
    }
  }

  return multiples;
}
