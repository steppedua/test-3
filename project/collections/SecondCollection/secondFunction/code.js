function secondFunction(flag, items) {
  console.log('Second function called with:', flag, items);
  if (!flag) {
    return 'Flag is false';
  }
  if (!items || items.length === 0) {
return 'No items provided';
  }
  return 'Processing items: ' + items.join(', ');
}